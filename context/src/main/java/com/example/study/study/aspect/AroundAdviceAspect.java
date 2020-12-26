/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeforeAdviceAspect Author: xutong Date: 2020/6/19
 * 9:04 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.example.study.study.aspect.entity.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@Aspect
@Component
public class AroundAdviceAspect {

  @Around(
      value =
          "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&args(user,something)")
  public void around(ProceedingJoinPoint joinpoint, User user, String something) throws Throwable {
    System.out.println(
        String.format(
            "[AroundAdviceAspect][around][before][%s][%s][%s]", user.getName(), user.getAge(), something));

    Object proceed = joinpoint.proceed();
      System.out.println(
              String.format(
                      "[AroundAdviceAspect][around][after][%s][%s][%s]", user.getName(), user.getAge(), something));
  }
}
