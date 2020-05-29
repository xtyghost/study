/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/5/29 1:13 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanlifecycle;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class Boot {

  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cycle/cycle.xml");
    context.registerShutdownHook(); // 确保触发destroy方法，在非web容器中
    BeanA beanA = context.getBean("beanA", BeanA.class);
    BasicDataSource bean = context.getBean(BasicDataSource.class);
    System.out.println(bean.getPassword());
  }
}
