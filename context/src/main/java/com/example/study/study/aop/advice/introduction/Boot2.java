/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot2 Author: xutong Date: 2020/9/8 10:37 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advice.introduction;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/8
 * @since 1.0.0
 */
public class Boot2 {
  public static void main(String[] args) {
    //
    ProxyFactory weaver = new ProxyFactory(new IDeveloperImpl());
    weaver.setInterfaces(new Class[] {ITester.class, IDeveloper.class});
      TesterFeatureIntroductionInterceptor advice = new TesterFeatureIntroductionInterceptor();
      weaver.addAdvice(advice);
//      DefaultIntroductionAdvisor advisor = new DefaultIntroductionAdvisor(advice, advice);
//      weaver.addAdvisor(advisor);
      Object proxy = weaver.getProxy();
      ((ITester) proxy).testSoftware();
      ((IDeveloper) proxy).developSoftware();
  }
}

