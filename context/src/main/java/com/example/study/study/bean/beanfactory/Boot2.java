/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/9 4:41 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/9
 * @since 1.0.0
 */
public class Boot2 {
  public static void main(String[] args) {
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions(new FileSystemResource("beans.xml"));

    // bring in some property values from a Properties file
    PropertySourcesPlaceholderConfigurer cfg = new PropertySourcesPlaceholderConfigurer();
    cfg.setLocation(new FileSystemResource("jdbc.properties"));

    // now actually do the replacement
    cfg.postProcessBeanFactory(factory);
  }
}
