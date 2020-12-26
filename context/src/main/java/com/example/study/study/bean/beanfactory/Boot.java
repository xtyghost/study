/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/9 4:41 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanfactory;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/9
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    factory.addBeanPostProcessor(new AutowiredAnnotationBeanPostProcessor());
    factory.addBeanPostProcessor(new MyBeanPostProcessor());
    factory.registerBeanDefinition("lisu", new RootBeanDefinition(Person.class));
    // 默认延迟加载，preInstantiateSingletons()可以提前加载bean
    factory.preInstantiateSingletons();
//    Person bean = factory.getBean(Person.class);
//    System.out.println(bean);
  }
}
