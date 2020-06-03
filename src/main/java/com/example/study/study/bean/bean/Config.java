/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Config Author: xutong Date: 2020/6/3 1:49 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.bean;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
@Configuration
public class Config {
  @Bean
  public static TestBeanC prototypeInstanceC() {
    return new TestBeanC("prototypeInstanceC for  nothing");
  }

  @Bean
//  @Scope("prototype")
  public TestBeanB prototypeInstanceB() {
    System.out.println("prototypeInstanceB___");
    System.out.println("---------------");

    //中间会执行，bean的初始化，从spring中获取B2
    System.out.println(prototypeInstanceB2().getClass());
    return new TestBeanB("prototypeInstanceB for ");
  }
     //禁用destroyMethod默认匹配
    @Bean(destroyMethod = "")
//  @Scope("prototype")
    public TestBeanB prototypeInstanceB2() {
    System.out.println("prototypeInstanceB2__");
        return new TestBeanB("prototypeInstanceB for ");
    }
}
