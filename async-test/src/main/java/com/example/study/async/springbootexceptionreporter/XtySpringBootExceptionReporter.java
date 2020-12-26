/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtySpringBootExceptionReporter Author: xutong Date:
 * 2020/10/12 9:34 上午 Description: Springboot的异常报告器 History: <author> <time> <version> <desc> 作者姓名
 * 修改时间 版本号 描述
 */
package com.example.study.async.springbootexceptionreporter;

import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.study.async.exception.ReporterTestException;

/**
 * 〈一句话功能简述〉<br>
 * 〈Springboot的启动异常报告器〉
 *
 * @author xutong
 * @create 2020/10/12
 * @since 1.0.0
 */
public class XtySpringBootExceptionReporter implements SpringBootExceptionReporter {
  public XtySpringBootExceptionReporter(ConfigurableApplicationContext ctx) {
    System.out.println("XtySpringBootExceptionReporter========" + ctx.toString());
  }

    /**
     * 在SpringApplicationRunListener.starting()之后
     * @param failure
     * @return
     */
  @Override
  public boolean reportException(Throwable failure) {

    if (failure instanceof ReporterTestException) {
      System.out.println("do nothing");
    }
    System.out.println("print exception On console");
    failure.printStackTrace();
    return true;
  }
}
