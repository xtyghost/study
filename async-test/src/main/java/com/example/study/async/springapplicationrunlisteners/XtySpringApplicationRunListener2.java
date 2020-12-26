/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtySpringApplicationRunListeners Author: xutong Date:
 * 2020/10/12 9:11 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.springapplicationrunlisteners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StopWatch;

import com.example.study.async.exception.PessimisticLockingFailureException;
import com.example.study.async.exception.ReporterTestException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/12
 * @since 1.0.0
 */
public class XtySpringApplicationRunListener2 implements SpringApplicationRunListener {
  private static final String NAME = "xty2";
  private StopWatch watch;

  public XtySpringApplicationRunListener2(SpringApplication application, String[] args) {
    watch = new StopWatch();

    System.out.println(application.toString() + "=======XtySpringApplicationRunListener2========" + args.toString());
  }

  @Override
  public void starting() {
    System.out.println(NAME + "========starting=====" + "starting()");
  }

  @Override
  public void environmentPrepared(ConfigurableEnvironment environment) {
    System.out.println(NAME + "=====environmentPrepared=======" + environment.toString());
  }

  @Override
  public void contextPrepared(ConfigurableApplicationContext context) {
      System.out.println(NAME + "=====contextPrepared=======" + context.toString());
//      throw new ReporterTestException("test");
  }

  @Override
  public void contextLoaded(ConfigurableApplicationContext context) {
    System.out.println(NAME + "======contextLoaded======" + context.toString());
  }

  @Override
  public void started(ConfigurableApplicationContext context) {
    System.out.println(NAME + "======started======" + context.toString());
  }

  @Override
  public void running(ConfigurableApplicationContext context) {
    System.out.println(NAME + "====running========" + context.toString());
  }

  @Override
  public void failed(ConfigurableApplicationContext context, Throwable exception) {
    System.out.println(NAME + "=====failed=======" + context.toString());
  }
}
