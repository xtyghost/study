package jmx.simple;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

/**
 * 定义agent层
 *
 * @author xutong
 */
public class HelloAgent {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName helloNmae = new ObjectName("jmxBean:name=hello");

        platformMBeanServer.registerMBean(new Hello(), helloNmae);
        TimeUnit.HOURS.sleep(1);

    }
}
