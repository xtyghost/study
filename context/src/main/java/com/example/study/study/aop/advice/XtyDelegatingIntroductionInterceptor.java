/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyDelegatingIntroductionIntercepter Author: xutong
 * Date: 2020/6/24 2:33 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈
 * around
 *  BeforeAdvice
 *  afterReturn
 *  Throws
 *  Introduction--只针对class
 *
 *   〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class XtyDelegatingIntroductionInterceptor extends DelegatingIntroductionInterceptor {

  @Override
  public Object invoke(MethodInvocation mi) throws Throwable {
    return super.invoke(mi);
  }

  @Override
  protected Object doProceed(MethodInvocation mi) throws Throwable {
    return super.doProceed(mi);
  }

  @Override
  public void suppressInterface(Class<?> ifc) {
    super.suppressInterface(ifc);
  }

  @Override
  public Class<?>[] getInterfaces() {
    return super.getInterfaces();
  }

  @Override
  public boolean implementsInterface(Class<?> ifc) {
    return super.implementsInterface(ifc);
  }

  @Override
  protected void implementInterfacesOnObject(Object delegate) {
    super.implementInterfacesOnObject(delegate);
  }
}
