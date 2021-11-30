/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BeforeAdviceAspect Author: xutong Date: 2020/6/19
 * 9:04 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
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
public class BeforeAdviceAspect {
    @Pointcut(
            value =
                    "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&args(a,b,..)",
            argNames = "a,b")
    public void pointcut(User a, String b) {
    }
    @Order(2)
    @Before(value = "pointcut(a,b)", argNames = "a,b")
    public void before(User a, String b) {
        System.out.println(String.format("[BeforeAdviceAspect][before][%s][%s][%s]", a.getName(), a.getAge(), b));
    }

    /**
     * if (bean instanceof Advised) {
     * Advised advised = (Advised) bean;
     * if (!advised.isFrozen() && isEligible(AopUtils.getTargetClass(bean))) {
     * // Add our local Advisor to the existing proxy's Advisor chain...
     * if (this.beforeExistingAdvisors) {
     * advised.addAdvisor(0, this.advisor);
     * }
     * else {
     * advised.addAdvisor(this.advisor);
     * }
     * return bean;* 			}
     * }
     *
     * @param a
     * @param b
     * @see AbstractAdvisingBeanPostProcessor
     */
    @Order(111)
    @Before(value = "pointcut(a,b)", argNames = "a,b")
    public void before2(User a, String b) {
        System.out.println(String.format("[BeforeAdviceAspect][before2][%s][%s][%s]", a.getName(), a.getAge(), b));
    }


    @Before(value = "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&args(java.io.Serializable)")
    public void before() {
        System.out.println("Serializable");
    }

}
