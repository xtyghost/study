/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeforeAdviceAspect Author: xutong Date: 2020/6/19
 * 9:04 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.study.study.aspect.entity.User;
import com.example.study.study.aspect.exception.CarNotFindException;

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
public class AfterThrowingAdviceAspect {
    /**
     *  高优先级
     * @param user
     * @param something
     * @param ex
     */
    @Order(9)
  @AfterThrowing(
      value =
          "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&args(user,something)",
      throwing = "ex")
  public void afterThrowing(User user, String something, CarNotFindException ex) {
    System.out.println(
        String.format(
            "[AfterThrowingAdviceAspect][afterThrowing][%s][%s][%s]",
            user.getName(), user.getAge(), something));
  }


}
