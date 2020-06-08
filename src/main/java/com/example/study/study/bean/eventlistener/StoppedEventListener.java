/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: RefreshedEventListener Author: xutong Date: 2020/6/5
 * 4:54 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class StartedEventListener implements ApplicationListener<ContextStartedEvent> {

  @Override
  public void onApplicationEvent(ContextStartedEvent event) {
    System.out.println("StartedEventListener--receive");
    System.out.println(event.getSource());
  }
}
