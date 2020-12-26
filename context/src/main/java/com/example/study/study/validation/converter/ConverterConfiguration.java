/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ConverterConfiguartion Author: xutong Date: 2020/6/17
 * 3:38 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation.converter;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/17
 * @since 1.0.0
 */
@Configuration
public class ConverterConfiguration {
  @Bean
  public ConversionServiceFactoryBean conversionServiceFactoryBean() {
    ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();
    factoryBean.setConverters(
        Collections.singleton((Converter<String, Integer>) Integer::valueOf));
    return factoryBean;
  }
    @Bean
    public MethodValidationPostProcessor validationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
