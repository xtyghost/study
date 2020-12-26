/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sdfs
 * Author:   xutong
 * Date:     2020/9/26 2:14 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.loadtimeweaving.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import cn.hutool.core.date.StopWatch;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/26
 * @since 1.0.0
 */
@Aspect
public class ProfileAspect {
    @Around("profileMethod()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.err.println(sw.prettyPrint());
        }
    }
    @Pointcut("execution(public * com.example.study.study.bean.loadtimeweaving.xml.DemoBean.*(..))")
    public void profileMethod() {
        System.out.println("profileMethod..");
    }
}