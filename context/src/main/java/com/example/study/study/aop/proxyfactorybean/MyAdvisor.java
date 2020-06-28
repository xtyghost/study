/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyAdvisor Author: xutong Date: 2020/6/24 3:42 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxyfactorybean;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class MyAdvisor implements MethodBeforeAdvice {
  private String someProperty;
  private volatile int count;

  public void setSomeProperty(String someProperty) {}
  @AfterReturning
  public void before(Method m, Object[] args, Object target) throws Throwable {
    synchronized (this) {
      ++count;
      System.out.println(count);
    }
  }

  public int getCount() {
    return count;
  }
}
