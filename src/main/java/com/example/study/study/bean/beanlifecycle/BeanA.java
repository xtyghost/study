/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeanA Author: xutong Date: 2020/5/29 10:21 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
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

  @Override
  public void close() throws Exception {}

  @Override
  public void start() {
    System.out.println("BeanA------SmartLifecycle-------start()");
  }

  @Override
  public void stop() {
    System.out.println("BeanA------SmartLifecycle-------stop()");
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
    return true;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("I'm InitializingBean-----afterPropertiesSet() ");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("I'm DisposableBean------destroy()");
  }
}
