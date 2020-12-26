/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/8/12 11:18 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.objectfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈每次调用都会生成新的MockNewsPersister〉
 *
 * @author xutong
 * @create 2020/8/12
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("objectfactory/objectfactory.xml");
      ctx.registerShutdownHook();
      MockNewsPersister persister = ctx.getBean(MockNewsPersister.class);
      persister.persistNews();
      persister.persistNews();


  }
}