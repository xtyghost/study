package jmx.simple;

/**
 * MBean接口,以实现类为前缀
 */
public interface HelloMBean {
    String getName();

    void setName(String name);

    String getAge();

    void setAge(String age);

    void helloWorld();

    void helloWorld(String str);

    void getTelephone();
}
