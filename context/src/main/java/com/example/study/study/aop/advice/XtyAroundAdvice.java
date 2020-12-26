/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyBeforeAdvice Author: xutong Date: 2020/6/24 2:05
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class XtyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        invocation.getMethod();
        invocation.getArguments();
        invocation.getThis();
        invocation.getStaticPart();
        invocation.getClass();
    return null;
    }
}
