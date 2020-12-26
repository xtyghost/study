/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/23 2:40 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.simpleaop;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.interceptor.DebugInterceptor;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.example.study.study.aop.proxy.proxyfactorybean.MyAdvice;
import com.example.study.study.aop.proxy.simpleaop.pojo.Pojo;
import com.example.study.study.aop.proxy.simpleaop.pojo.SimplePojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈编程的方式创建代理〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
    ProxyFactory factory = new ProxyFactory(new SimplePojo());
    factory.addInterface(Pojo.class);
    //    factory.addAdvice(new MyAdvice());
    factory.addAdvice(new DebugInterceptor());
    factory.addAdvisor(
        new DefaultPointcutAdvisor(
            new Pointcut() {
              @Override
              public ClassFilter getClassFilter() {
                return clazz -> Pojo.class.isAssignableFrom(clazz);
              }

              @Override
              public MethodMatcher getMethodMatcher() {
                return new MethodMatcher() {
                  @Override
                  public boolean matches(Method method, Class<?> targetClass) {
                    if ("foo2".equals(method.getName())) {
                      return true;
                    }
                    return false;
                  }

                  @Override
                  public boolean isRuntime() {
                    return false;
                  }

                  @Override
                  public boolean matches(Method method, Class<?> targetClass, Object... args) {
                    return false;
                  }
                };
              }
            },
            new MyAdvice()));
    // JdkDynamicAopProxy
    // ObjenesisCglibAopProxy
    Pojo proxy = (Pojo) factory.getProxy();
    proxy.foo();
    proxy.foo2();
  }
}
