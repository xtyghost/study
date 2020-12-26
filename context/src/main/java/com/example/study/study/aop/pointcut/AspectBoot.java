/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AspectBoot Author: xutong Date: 2020/9/11 4:59 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.pointcut;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/11
 * @since 1.0.0
 */
public class AspectBoot {
  public static void main(String[] args) throws NoSuchMethodException {
    AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    pointcut.setExpression(
        "execution(public void com.example.study.study.aop.pointcut.Work.someMethodName())");
    Assert.assertTrue(pointcut.matches(Work.class));
    Method someMethodName = Work.class.getMethod("someMethodName");
    Assert.assertTrue(pointcut.getMethodMatcher().matches(someMethodName, Work.class));
  }
}
