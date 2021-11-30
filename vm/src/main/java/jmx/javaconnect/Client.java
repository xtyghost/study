package jmx.javaconnect;


import jmx.simple.HelloMBean;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;

/**
 * https://www.cnblogs.com/dongguacai/p/5900507.html
 *
 * @author xutong
 */
public class Client {
    public static void main(String[] args) throws IOException, MalformedObjectNameException, ReflectionException, AttributeNotFoundException, InstanceNotFoundException, MBeanException, InvalidAttributeValueException {
        JMXServiceURL jmxServiceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi");
        JMXConnector jmxConnector = JMXConnectorFactory.connect(jmxServiceURL, null);
        MBeanServerConnection mbsc = jmxConnector.getMBeanServerConnection();
        ObjectName helloName = new ObjectName("jmxBean:name=hello");
        java.lang.String[] domains = mbsc.getDomains();
        for (int i = 0; i < domains.length; i++) {
            System.out.println("domain[" + i + "]=" + domains[i]);
        }
        System.out.println("MBean count = " + mbsc.getMBeanCount());
        //设置Mbean的特定属性值
        //这里的setAttribute,getAttribute错做只能针对bean的数据
        //例如getName或者setName进行操作，只能使用Name需要去除方法的前缀
        String age = (String) mbsc.getAttribute(helloName, "Age");
        String name = (String) mbsc.getAttribute(helloName, "Name");
        System.out.printf("age===%s;name====%s", age, name);
        System.out.println();
        mbsc.setAttribute(helloName, new Attribute("Name", "杭州"));
        mbsc.setAttribute(helloName, new Attribute("Age", "1990"));
        age = (String) mbsc.getAttribute(helloName, "Age");
        name = (String) mbsc.getAttribute(helloName, "Name");
        System.out.printf("age===%s;name====%s", age, name);
        HelloMBean proxy = MBeanServerInvocationHandler
                .newProxyInstance(mbsc, helloName, HelloMBean.class, false);
        proxy.helloWorld();
        proxy.helloWorld("migu");
        proxy.getTelephone();
        //invoke调用bean的方法，只能针对非属性方法
        //例如invoke不能对getName方法进行调用
        mbsc.invoke(helloName, "getTelephone", null, null);
        mbsc.invoke(helloName, "helloWorld"
                , new java.lang.String[]{"I'll connect to JMX Server via client2"},
                new java.lang.String[]{"java.lang.String"});
        mbsc.invoke(helloName, "helloWorld", null, null);
    }
}
