/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/23 2:56 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.aspectj;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

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
    AspectJProxyFactory factory = new AspectJProxyFactory(new SimplePojo());
    factory.addAspect(new BeforeAdviceAspect());
//    factory.addAspect(BeforeAdviceAspect.class);
    Pojo proxy = factory.getProxy();
    proxy.foo();
  }
}
