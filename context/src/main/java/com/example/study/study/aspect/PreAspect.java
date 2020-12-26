/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PreAspect Author: xutong Date: 2020/6/19 4:22 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * 〈一句话功能简述〉<br>
 * 〈
 *   perthis为每个切面代理对象生成一个切面
 *   pertarget为每个切面代理对象target生成一个切面
 * 〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@Aspect("perthis(com.example.study.study.aspect.PreAspect.pre())")
@Component()
@Scope(scopeName = SCOPE_PROTOTYPE)
public class PreAspect {

  @Pointcut(
      "execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component.getCar(..))&&execution(com.example.study.study.aspect.entity.Car com.example.study.study.aspect.Component2.getCar(..))")
  public void pre() {}

  @Before("com.example.study.study.aspect.PreAspect.pre()")
  public void recordServiceUsage() {
    // ...
    System.out.println(this.hashCode());
  }
}
