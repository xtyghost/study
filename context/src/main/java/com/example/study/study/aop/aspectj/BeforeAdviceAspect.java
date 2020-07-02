/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeforeAdviceAspect Author: xutong Date: 2020/6/19
 * 9:04 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@Aspect
//@EnableAspectJAutoProxy
public class BeforeAdviceAspect {
  @Pointcut(value = "execution(* com.example.study.study.aop.proxy.simpleaop.pojo.Pojo.foo(..))")
  public void pointcut() {}

  @Before(value = "pointcut()")
  public void before() {
    System.out.println("before");
  }
}
