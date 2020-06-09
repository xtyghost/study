/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ThreadB
 * Author:   xutong
 * Date:     2020/5/29 10:39 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.scope;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈TARGET_CLASS,启用cglib代理〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Component
@Scope(value = "thread",proxyMode = TARGET_CLASS)
public class ThreadB implements Command {
  public void execute(){
    System.out.println("I'm B====="+Thread.currentThread()+"================"+this.hashCode());
  }
}