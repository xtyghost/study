/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/3 4:34 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.methodreplacer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("methodreplacer/methodreplace.xml");
      ctx.registerShutdownHook();
      ctx.getBean(TargetObject.class).doSomething();
  }
}
