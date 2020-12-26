/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/5/29 1:13 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanlifecycle;

import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * <bean class="org.springframework.beans.factory.config.PropertyOverrideConfigurer"> <property
 * name="location" value="classpath:com/something/jdbc_replace.properties"/> <property name="order"
 * value="10"/> </bean> <bean
 * class="org.springframework.context.support.PropertySourcesPlaceholderConfigurer"> <property
 * name="locations" value="classpath:com/something/jdbc.properties"/> </bean>
 *属性覆盖
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class Boot {

  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cycle/cycle.xml");
    context.registerShutdownHook(); // 确保触发destroy方法，在非web容器中
    try(BeanA beanA = context.getBean("beanA", BeanA.class);){

    } catch (Exception e) {
        e.printStackTrace();
    }
      BasicDataSource bean = context.getBean(BasicDataSource.class);
    System.out.println(bean.getPassword());
    new ReentrantLock().lock();

  }
}
