/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: config Author: xutong Date: 2020/7/2 1:28 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.autoproxy;

import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/7/2
 * @since 1.0.0
 */
@Configuration
public class Config {
  @Bean
  public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
    return new DefaultAdvisorAutoProxyCreator();
  }

  @Bean
  public MyAdvisor myAdvisor() {
    return new MyAdvisor();
  }

  @Bean
  public BusinessObject1 businessObject1() {
    return new BusinessObject1();
  }
}
