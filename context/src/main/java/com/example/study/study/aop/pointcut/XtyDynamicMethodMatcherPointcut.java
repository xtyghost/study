/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyDynamicMethodMatcherPointcut
 * Author:   xutong
 * Date:     2020/9/7 11:15 上午
 * Description: 动态方法匹配pointcut
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

/**
 * 〈一句话功能简述〉<br> 
 * 〈动态方法匹配pointcut〉
 *
 * @author xutong
 * @create 2020/9/7
 * @since 1.0.0
 */
public class XtyDynamicMethodMatcherPointcut extends DynamicMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return super.matches(method, targetClass);
    }

    /**
     * 根据 matches(Method method, Class<?> targetClass)的返回值判断是否要动态执行
     * matches(Method method, Class<?> targetClass, Object... args)
     * @param method
     * @param targetClass
     * @param args
     * @return
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        return false;
    }
}