/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyBeanNameGenerator
 * Author:   xutong
 * Date:     2020/10/12 9:52 上午
 * Description: 自定义的bean名称生成器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.async.beannamegenerator;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的bean名称生成器〉
 *
 * @author xutong
 * @create 2020/10/12
 * @since 1.0.0
 */
public class XtyBeanNameGenerator implements BeanNameGenerator {
    private BeanNameGenerator handler=new FullyQualifiedAnnotationBeanNameGenerator();

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        return "xty@"+handler.generateBeanName(definition,registry);
    }
}