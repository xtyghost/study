/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyBeforeAdvice Author: xutong Date: 2020/6/24 2:05
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class XtyReturnAdvice implements AfterReturningAdvice {
  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable {}
}
