/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Config Author: xutong Date: 2020/6/3 4:36 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.methodlookup;

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
  @Scope("prototype")
  public AsyncCommand asyncCommand() {
    AsyncCommand command = new AsyncCommand();
    // inject dependencies here as required
    return command;
  }

  @Bean
  public CommandManager commandManager() {
    // return new anonymous implementation of CommandManager with createCommand()
    // overridden to return a new prototype Command object
    return new CommandManager() {
      protected Command createCommand() {
        return asyncCommand();
      }
    };
  }
}
