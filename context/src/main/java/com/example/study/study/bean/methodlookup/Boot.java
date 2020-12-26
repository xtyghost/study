/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/3 4:34 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.methodlookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.scan("com.example.study.study.bean.methodlookup");
    ctx.refresh();
    CommandManager commandManager = ctx.getBean("commandManager", CommandManager.class);
      Command command = commandManager.createCommand();
    System.out.println(command);
    System.out.println(commandManager.createCommand());
      command.setState("sdfsf");
      command.execute();
  }
}
