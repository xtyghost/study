/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/5/29 1:13 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.valueresolve;

import org.junit.Assert;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class Boot {

  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("valueresolve/valueresolve.xml");
    MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
    MovieRecommender2 movieRecommender2 =
        context.getBean("movieRecommender2", MovieRecommender2.class);
    Assert.assertEquals("MovieCatalog", movieRecommender.getCatalog());
    Assert.assertEquals("sdf",movieRecommender2.getCatalog());
//    Assert.assertEquals("lisuCatalog", movieRecommender2.getCatalog());
    Assert.assertTrue( movieRecommender2.getCountOfMoviesPerCatalog().get("Thriller").equals(100));

//    System.out.println(context.getBean("systemProperties"));
  }
}
