/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyApplicationListener Author: xutong Date: 2020/6/5
 * 3:43 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class MyApplicationListener2 {

  @Async
  @EventListener(classes = MyApplicationEvent.class)
  public void onApplicationEvent(MyApplicationEvent event) throws Exception {
    System.out.println("I'm receive a Async message");
    System.out.println(event.getSource());
    System.out.println(Thread.currentThread().getName());
    throw new Exception("sdfsf");
  }
}