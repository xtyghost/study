/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyConfiguration Author: xutong Date: 2020/6/2 11:36
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.autowired.pattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/2
 * @since 1.0.0
 */
@Configuration
public class MyConfiguration {

  @Bean
  public StringStore<String> stringStore() {
    return new StringStore<String>();
  }

  @Bean
  public IntegerStore<Integer> integerStore() {
    return new IntegerStore<Integer>();
  }
}
