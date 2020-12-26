/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/3 3:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.loadtimeweaving;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

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
    //    ApplicationContext ctx = new
    // AnnotationConfigApplicationContext(AppConfig.class,Test.class);
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.register(AppConfig.class);
    ctx.setBeanNameGenerator(new FullyQualifiedAnnotationBeanNameGenerator());
    ctx.refresh();
      MyLoadTimeBean bean = ctx.getBean(MyLoadTimeBean.class);
      bean.getInnerBean().test();
    System.out.println(bean.hashCode());
  }
}
