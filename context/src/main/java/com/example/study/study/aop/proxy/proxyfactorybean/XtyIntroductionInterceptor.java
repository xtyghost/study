/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyIntroductionInterceptor
 * Author:   xutong
 * Date:     2020/6/24 4:21 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.proxy.proxyfactorybean;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class XtyIntroductionInterceptor implements IntroductionInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
    return null;
    }

    @Override
    public boolean implementsInterface(Class<?> intf) {
        return false;
    }
}