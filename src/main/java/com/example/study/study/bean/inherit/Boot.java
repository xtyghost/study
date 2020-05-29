/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: com.example.study.study.bean.beanpostprocessor.Boot
 * Author:   xutong
 * Date:     2020/5/29 10:58 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.inherit;

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
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/inherited.xml");
      ctx.registerShutdownHook();
      DerivedTestBean derivedTestBean = ctx.getBean("inheritsWithDifferentClass", DerivedTestBean.class);
    System.out.println(derivedTestBean.toString());
  }
}