/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Config Author: xutong Date: 2020/6/23 4:03 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.configured;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
@Configuration
@EnableSpringConfigured
public class Config {
  /**
   * *
   * -javaagent:~/.m2/repository/org/springframework/spring-instrument/5.2.6.RELEASE/org.springframework.instrument-5.2.6.RELEASE.jar
   *
   * @return
   * @throws Throwable
   */
  @Bean
  public InstrumentationLoadTimeWeaver loadTimeWeaver() throws Throwable {
    InstrumentationLoadTimeWeaver loadTimeWeaver = new InstrumentationLoadTimeWeaver();
    return loadTimeWeaver;
  }
}
