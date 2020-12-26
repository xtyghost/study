/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyStaticMethodMatcherPointcut
 * Author:   xutong
 * Date:     2020/9/7 11:10 上午
 * Description: 自定义的静态方法切面
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的静态方法切面〉
 *
 * @author xutong
 * @create 2020/9/7
 * @since 1.0.0
 */
public class XtyStaticMethodMatcherPointcut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return method.getName().startsWith("xty")&&targetClass.getPackage().getName().endsWith("dao");
    }
}