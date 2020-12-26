/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyPropertiesBeanDefinitionReader
 * Author:   xutong
 * Date:     2020/8/6 10:43 上午
 * Description: 自定义的properties文件解析器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.resource.reader;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的properties文件解析器〉
 *
 * @author xutong
 * @create 2020/8/6
 * @since 1.0.0
 */
public class XtyPropertiesBeanDefinitionReader extends PropertiesBeanDefinitionReader {

    /**
     * Create new PropertiesBeanDefinitionReader for the given bean factory.
     *
     * @param registry the BeanFactory to load bean definitions into,
     *                 in the form of a BeanDefinitionRegistry
     */
    public XtyPropertiesBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
    }
}