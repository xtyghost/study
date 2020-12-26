/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeforeAdviceAspect Author: xutong Date: 2020/6/19
 * 9:04 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.study.study.aspect.entity.Car;
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
public class AfterReturningAdviceAspect {

  @Pointcut(
      value =
          "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&args(a,b,..)",
      argNames = "a,b")
  public void pointcut(User a, String b) {}

  @AfterReturning(value = "pointcut(a,b)", returning = "car")
  public void afterReturning(User a, String b, Car car) {
    System.out.println(
        String.format(
            "[AfterReturningAdviceAspect][afterReturning][%s][%s][%s]",
            a.getName(), a.getAge(), b));
    System.out.println("return===============" + car.toString());
  }
}
