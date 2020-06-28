/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/23 3:34 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.configured;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * <p>FIXME 有问题
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext("configurable/configurable.xml");
    Command bean = ctx.getBean(Command.class);
    bean.doSomething();
  }
  //  public static void main(String[] args) {
  //    //
  //    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
  //    ctx.scan("com.example.study.study.aop.configured");
  //    ctx.refresh();
  //      CommandAnnotation bean = ctx.getBean(CommandAnnotation.class);
  //      bean.doSomething();
  //  }
}
