/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MyAdivsor
 * Author:   xutong
 * Date:     2020/7/1 6:03 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.proxy.autoproxy;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

/**
 * 〈一句话功能简述〉<br> 
 * 〈spring中的aspect切面〉
 *
 * @author xutong
 * @create 2020/7/1
 * @since 1.0.0
 */
public class MyAdvisor extends AbstractPointcutAdvisor {

    @Override
    public Pointcut getPointcut() {
        NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
        pointcut.addMethodName("say");
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return new BusinessAdvice();
    }
}