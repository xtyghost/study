/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyInstantiationAwareBeanPostProcessor Author: xutong
 * Date: 2020/6/28 6:16 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.proxyfactorybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 // Give any InstantiationAwareBeanPostProcessors the opportunity to modify the // state of the
 * bean before properties are set. This can be used, for example, // to support styles of field
 * injection.
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
public class XtyInstantiationAwareBeanPostProcessor
    implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return null;
    }
}
