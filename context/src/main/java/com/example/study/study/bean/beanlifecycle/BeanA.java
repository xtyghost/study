/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeanA Author: xutong Date: 2020/5/29 10:21 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Component
public class BeanA implements AutoCloseable, SmartLifecycle, InitializingBean, DisposableBean {

  private String name;
  private Integer age;
  private boolean state;
  private String require;

  public static BeanA factoryMethod() {
    System.out.println("I'n static factoryMethod");
    return new BeanA();
  }

  public String getRequire() {
    return require;
  }

  @Required
  public void setRequire(String require) {
    System.out.println("I'm required");
    this.require = require;
  }

  public String getName() {
    return name;
  }

  @Required
  public void setName(String name) {
    System.out.println("通过setName设置名称");
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public void close() throws Exception {
    System.out.println("autocolse接口关闭资源");
  }

  /**
   * 如果不是自动启动，applicatonContext会调用 SmartLifecycle-------start()
   *
   * @return
   */
  @Override
  public void start() {
    System.out.println("BeanA------SmartLifecycle-------start()");
    state = true;
  }

  @Override
  public void stop() {
    System.out.println("BeanA------SmartLifecycle-------stop()");
    state = false;
  }

  @PostConstruct
  public void init() {
    // 注解先于，接口，
    // 接口先于，xml配置
    System.out.println("I'm PostConstruct 1");
  }

  @PreDestroy
  public void destroy1() {
    System.out.println("I'm PreDestroy 1");
  }

  @Override
  public boolean isRunning() {
    // 改为true可以触发stop,在容器关闭时
    return state;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("I'm InitializingBean-----afterPropertiesSet() ");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("I'm DisposableBean------destroy()");
  }

  public void initXml() {
    System.out.println("BeanA init Xml");
  }

  public void destroyXml() {
    System.out.println("BeanA destroy Xml");
  }

  @Override
  public int getPhase() {
    return 0;
  }
}
