/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyIntroductionAdvisor Author: xutong Date: 2020/6/24
 * 4:37 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxyfactorybean;

import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.IntroductionAdvisor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class XtyIntroductionAdvisor implements IntroductionAdvisor {
    @Override
    public ClassFilter getClassFilter() {
    return null;
    }

    @Override
    public void validateInterfaces() throws IllegalArgumentException {

    }

    @Override
    public Advice getAdvice() {
        return null;
    }

    @Override
    public boolean isPerInstance() {
        return false;
    }

    @Override
    public Class<?>[] getInterfaces() {
        return new Class[0];
    }
}
