/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: LockMixin Author: xutong Date: 2020/6/24 4:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxyfactorybean;

import org.aopalliance.intercept.MethodInvocation;
import org.multiverse.api.exceptions.LockedException;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

  private boolean locked;

  @Override
  public void lock() {
    this.locked = true;
  }

  @Override
  public void unlock() {
    this.locked = false;
  }

  @Override
  public boolean locked() {
    return this.locked;
  }

  public Object invoke(MethodInvocation invocation) throws Throwable {
    if (locked() && invocation.getMethod().getName().indexOf("set") == 0) {
      throw new LockedException();
    }
    return super.invoke(invocation);
  }
}
