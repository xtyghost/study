/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AppConfig Author: xutong Date: 2020/6/5 12:48 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.loadtimeweaving;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.Import;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;

/**
 * 〈一句话功能简述〉<br>
 * 〈spring动态的转换类〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
@Configuration
@EnableLoadTimeWeaving
@Import(InnerBean.class)
public class AppConfig {
  @Bean
  public MyLoadTimeBean myLoadTimeBean() {
      MyLoadTimeBean myLoadTimeBean = new MyLoadTimeBean();
    System.out.println(myLoadTimeBean.hashCode());
      return myLoadTimeBean;
  }

  /**
   * *
   * -javaagent:/Users/xutong/.m2/repository/org/springframework/spring-instrument/5.2.6.RELEASE/spring-instrument-5.2.6.RELEASE.jar
   *
   * <p>// Detect a LoadTimeWeaver and prepare for weaving, if found. if
   * (beanFactory.containsBean(LOAD_TIME_WEAVER_BEAN_NAME)) { beanFactory.addBeanPostProcessor(new
   * LoadTimeWeaverAwareProcessor(beanFactory)); // Set a temporary ClassLoader for type matching.
   * beanFactory.setTempClassLoader(new
   * ContextTypeMatchClassLoader(beanFactory.getBeanClassLoader())); }
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
