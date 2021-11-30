package jmx.notification;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * @author xutong
 */
public class HelloAgent {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("yunge:name=Hello");
        Hello hello = new Hello();
        server.registerMBean(hello, objectName);
        Jack jack = new Jack();
        server.registerMBean(jack, new ObjectName("jack:name=Jack"));
        jack.addNotificationListener(new HelloListener(), null, hello);
        Thread.sleep(Long.parseLong("500000"));
    }
}
