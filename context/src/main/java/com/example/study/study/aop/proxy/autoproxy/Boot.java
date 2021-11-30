/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/7/1 5:59 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.autoproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈自动代理的测试〉
 *
 * @author xutong
 * @create 2020/7/1
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    //      new DefaultAdvisorAutoProxyCreator();
    ctx.register(Config.class);

    ctx.refresh();
    BusinessObject bean = (BusinessObject) ctx.getBean("businessObject1");
    bean.say();
  }
}
