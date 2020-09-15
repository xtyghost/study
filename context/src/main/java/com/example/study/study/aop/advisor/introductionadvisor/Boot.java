/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/9/7 1:48 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.advisor.introductionadvisor;

import org.aopalliance.aop.Advice;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/7
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
//      ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("introductionadvisor/introductionadvisor.xml");
      DelegatingIntroductionInterceptor interceptor1 = new DelegatingIntroductionInterceptor(new ITesterImpl());
      DelegatePerTargetObjectIntroductionInterceptor interceptor2 = new DelegatePerTargetObjectIntroductionInterceptor(ITesterImpl.class,ITester.class);
      DefaultIntroductionAdvisor introductionAdvisor = new DefaultIntroductionAdvisor(interceptor1,interceptor1);
//      DefaultIntroductionAdvisor introductionAdvisor = new DefaultIntroductionAdvisor(interceptor2,interceptor2);
      introductionAdvisor.addInterface(ITester.class);

      ProxyFactory f = new ProxyFactory();
      f.addAdvisor(introductionAdvisor);
      ITester proxy = (ITester) f.getProxy();
    System.out.println(proxy.getClass().getPackage());
      proxy.testSoftware();



  }
}