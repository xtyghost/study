/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Command Author: xutong Date: 2020/6/23 3:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.configured;

import java.lang.instrument.ClassFileTransformer;

import org.springframework.instrument.classloading.LoadTimeWeaver;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class Command implements LoadTimeWeaver {
  public void doSomething() {
    Account account = new Account();
    System.out.println(account.getPerson().getName());
  }

    @Override
    public void addTransformer(ClassFileTransformer transformer) {}

    @Override
    public ClassLoader getInstrumentableClassLoader() {
        return this.getClass().getClassLoader();
    }

    @Override
    public ClassLoader getThrowawayClassLoader() {
        return this.getClass().getClassLoader();
    }
}
