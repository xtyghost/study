/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AliasConfig Author: xutong Date: 2020/5/29 9:56 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.alias;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Configuration
public class AliasConfig {

  @Bean()
//  @ConditionalOnMissingBean(Command.class)
  public Command commandA() {
    return new CommandImplA();
  }
  @Bean()
  public Command commandB() {
    return new CommandImplB();
  }
}
