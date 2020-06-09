/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ScopConfig Author: xutong Date: 2020/5/29 10:48 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.scope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.SimpleThreadScope;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Configuration
public class ScopConfig {

  @Bean
  public CustomScopeConfigurer customScopeConfigurer() {
    ThreadScopConfiguer threadScopConfiguer = new ThreadScopConfiguer();
    threadScopConfiguer.addScope("thread", new SimpleThreadScope());
    return threadScopConfiguer;
  }
}
