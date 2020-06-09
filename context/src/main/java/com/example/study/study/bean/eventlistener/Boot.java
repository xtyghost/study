/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/5 3:45 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.eventlistener;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) throws InterruptedException {
    //
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(EventConfig.class);
    ctx.refresh();
      ctx.registerShutdownHook();
      ctx.publishEvent(new MyApplicationEvent("lisu"));
    TimeUnit.SECONDS.sleep(20);
  }
}
