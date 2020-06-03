/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/3 3:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.annotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //    ApplicationContext ctx = new
    // AnnotationConfigApplicationContext(AppConfig.class,Test.class);
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.setBeanNameGenerator(new FullyQualifiedAnnotationBeanNameGenerator());
    ctx.scan("com.example.study.study.bean.annotation");
    ctx.registerBean("test",Test.class, bd -> {
        bd.setAttribute("name","ll");
    });
    ctx.refresh();
    MyService myService = ctx.getBean(Test.class);
    myService.doStuff();
  }
}
