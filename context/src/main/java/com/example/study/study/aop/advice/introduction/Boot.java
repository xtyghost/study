/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Boot
 * Author:   xutong
 * Date:     2020/9/2 11:14 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.advice.introduction;

import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/2
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
//      DelegatePerTargetObjectIntroductionInterceptor interceptor = new DelegatePerTargetObjectIntroductionInterceptor(ITesterImpl.class, ITester.class);
//      interceptor.invoke(new ReflectiveMethodInvocation())
      TesterFeatureIntroductionInterceptor testerFeatureIntroductionInterceptor = new TesterFeatureIntroductionInterceptor();

  }
}