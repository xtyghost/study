/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ThreadScopConfiguer Author: xutong Date: 2020/5/29
 * 10:33 上午 Description: 自定义声明式注册thread范围 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.scope;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.CustomScopeConfigurer;

/**
 * 〈一句话功能简述〉<br>
 * 〈自定义声明式注册thread范围〉 bean的声明周期,singleton,prototype
 * ,request,session,application,websocket==需要注册RequestContextFilter或RequestContextListener
 * 还有未注册的thread;
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class ThreadScopConfiguer extends CustomScopeConfigurer implements BeanNameAware {

  @Override
  public void setBeanName(String s) {
    System.out.println("My name is " + s);

  }
}
