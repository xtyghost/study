package jmx.javaconnect;

import jmx.simple.Hello;

import javax.management.*;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.rmi.registry.LocateRegistry;

/**
 * @author xutong
 */
public class HelloAgent {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("jmxBean:name=hello");
        Hello hello = new Hello();
        hello.setAge("1");
        hello.setName("lisu");
        server.registerMBean(hello, objectName);
        try {
            //注册一个端口方便连接
            LocateRegistry.createRegistry(9999);
            //Uri罗京的结尾可以随便指定，如果想用jconsole来连接，必须以jmxrmi结尾
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
            JMXConnectorServer jcs = JMXConnectorServerFactory.newJMXConnectorServer(url, null, server);
            System.out.println("begin rmi start");
            jcs.start();
            System.out.println("rmi start");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
