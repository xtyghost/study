/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/9/1 9:22 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/1
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
      NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
      nameMatchMethodPointcut.setMappedNames("*match","match*");
      nameMatchMethodPointcut.setClassFilter(ClassFilter.TRUE);
      ProxyFactoryBean bean = new ProxyFactoryBean();
//      bean.setTargetName("com.example.study.study.aop.pointcut.Work");
      bean.setTarget(new Work());
//      bean.setInterceptorNames();
//      bean.setAdvisorAdapterRegistry();
      Work work= (Work) bean.getObject();
      work.someMethodName();

  }
}