package jmx.notification;

/**
 * @author xutong
 */

/*
 * 接口名必须以MBean结尾
 */
public interface HelloMBean {
    public String getName();

    public void setName(String name);

    public void printHello();

    public void printHello(String whoName);
}
