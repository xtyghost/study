/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/3 5:48 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.study.study.bean.factorybean.BeanA;

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
    //
    AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
      cxt.getEnvironment().addActiveProfile("test");
      cxt.register(Config.class);
      cxt.refresh();
      BeanA bean = cxt.getBean(BeanA.class);
    System.out.println(bean.toString());
    TestProfile bean1 = cxt.getBean(TestProfile.class);
  }
}
