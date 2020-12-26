/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyDelegatePerTargetObjectIntroductionInterceptor
 * Author:   xutong
 * Date:     2020/9/7 2:11 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.advisor.introductionadvisor;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/7
 * @since 1.0.0
 */
public class XtyDelegatePerTargetObjectIntroductionInterceptor extends DelegatePerTargetObjectIntroductionInterceptor {

    public XtyDelegatePerTargetObjectIntroductionInterceptor(Class<?> defaultImplType, Class<?> interfaceType) {
        super(defaultImplType, interfaceType);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    @Override
    protected Object doProceed(MethodInvocation mi) throws Throwable {
        return super.doProceed(mi);
    }
}