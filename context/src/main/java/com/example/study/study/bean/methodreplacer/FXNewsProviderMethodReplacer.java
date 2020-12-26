/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FXNewsProviderMethodReplacer
 * Author:   xutong
 * Date:     2020/8/12 1:32 下午
 * Description: spring的方法替换
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.methodreplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈一句话功能简述〉<br> 
 * 〈spring的方法替换〉
 *
 * @author xutong
 * @create 2020/8/12
 * @since 1.0.0
 */
@Slf4j
@Component
public class FXNewsProviderMethodReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        log.info("before method replace");
        log.info("doSomething");
        log.info("after method replace");
    return null;
    }
}