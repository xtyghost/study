/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/23 2:40 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.simpleaop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

import com.example.study.study.aop.simpleaop.pojo.Pojo;
import com.example.study.study.aop.simpleaop.pojo.SimplePojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
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
    factory.addAdvice(new Advice() {});
    Pojo proxy = (Pojo) factory.getProxy();
    proxy.foo();
  }
}
