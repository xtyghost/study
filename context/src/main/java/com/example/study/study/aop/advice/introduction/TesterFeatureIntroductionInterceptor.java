/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TesterFeatureIntroductionInterceptor Author: xutong
 * Date: 2020/9/2 10:56 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advice.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/2
 * @since 1.0.0
 */
public class TesterFeatureIntroductionInterceptor extends DelegatingIntroductionInterceptor
    implements ITester {
  private static final long serialVersionUID = -1;
  private boolean busyAsTester;

  @Override
  public Object invoke(MethodInvocation mi) throws Throwable {
    if (isBusyAsTester() && StringUtils.contains(mi.getMethod().getName(),"developSoftware")) {
        throw new RuntimeException("the person you call is offline");
    }

    return super.invoke(mi);
  }

  @Override
  public boolean isBusyAsTester() {
    return busyAsTester;
  }

  public void setBusyAsTester(boolean busyAsTester) {
    this.busyAsTester = busyAsTester;
  }

  @Override
  public void testSoftware() {
    System.out.println("I will ensure the quality");
  }
}
