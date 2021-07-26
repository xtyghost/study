/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CglibTest Author: xutong Date: 2020/6/18 9:33 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.cglib;

import org.junit.Assert;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/18
 * @since 1.0.0
 */
public class CglibMethodInvokeTest {
  public static void main(String[] args) {

    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(SampleClass.class);
    enhancer.setCallback(
            (MethodInterceptor) (o, method, objects, methodProxy) -> {
              //            System.out.println(method.getDeclaringClass());
                method.invoke(o,objects);
//                methodProxy.invokeSuper(o,objects);
              if (method.getDeclaringClass() != Object.class
                  && method.getReturnType() == String.class) {
                return "hello cglib";
              } else {
                throw new RuntimeException("Do not know what to do");
              }
            });
    SampleClass proxy = (SampleClass) enhancer.create();
    Assert.assertEquals("hello cglib", proxy.test(null));
    String actual = proxy.toString();
    System.out.println(actual);
    Assert.assertNotEquals("Hello cglib", actual);
  }
}
