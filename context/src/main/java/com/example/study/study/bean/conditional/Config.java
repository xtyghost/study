/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Config Author: xutong Date: 2020/6/3 5:41 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
@ImportResource(locations = {"factorybean/factorybean.xml"}) // 导入xml文件
@Configuration
public class Config {
  @Profile({"test"})
  @Conditional(SimpleConditional.class)
  @Bean
  public TestProfile testProfile() {
    return new TestProfile();
  }
}
