/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Configuration Author: xutong Date: 2020/6/28 5:19 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.proxyfactorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
@Configuration
public class Config {
    @Bean
    public Person person2(){
        return new PersonImpl2();
    }
}
