/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/8/13 9:26 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.resource.propertyeditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/8/13
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resource/propertyeditor/propertyeditor.xml");
      ctx.registerShutdownHook();
      DateFoo bean = ctx.getBean(DateFoo.class);
      Object bean1 = ctx.getBean("dateFoo");
      System.out.println(bean.getDate().toString());
  }
}