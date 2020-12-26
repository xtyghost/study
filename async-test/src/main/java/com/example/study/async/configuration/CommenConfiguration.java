/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CommenConfiguration Author: xutong Date: 2020/6/28
 * 4:35 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.filter.RequestContextFilter;

import com.example.study.async.initializingbean.XtyInitializingBean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
@Configuration
public class CommenConfiguration {
  @Bean
  public RequestContextListener requestContextlListener() {
    return new RequestContextListener();
  }

  /**
   * 使用第三方sevlet时使用，激活request，seesion，application ，websocket等scope
   *
   * @return
   */
  @Bean
  public RequestContextFilter requestContextFilter() {
    return new RequestContextFilter();
  }

  @Bean
  public XtyInitializingBean xtyInitialBean() {
    return new XtyInitializingBean();
  }
}
