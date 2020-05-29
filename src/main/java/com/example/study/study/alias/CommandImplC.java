/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CommandImplC Author: xutong Date: 2020/5/29 10:08 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.alias;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Component
public  class CommandImplC implements Command {
  @Lookup("commandA")
  public  Command command(){

      return null;
  }

    @Override
    public void execute() {
    System.out.println("I'm C");
    }
}
