/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Compent Author: xutong Date: 2020/6/3 1:47 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.bean;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
@Component
public class FactoryMethodComponent {
    @Bean
//    @Scope("prototype")
    public TestBeanA prototypeInstanceA() {
    System.out.println("prototypeInstanceA++");
    System.out.println("+++++++++++++++++++++");
    //直接调用不经过spring
    System.out.println(prototypeInstanceA2().getClass());
        return new TestBeanA("prototypeInstanceA for ");
    }
    @Bean
//    @Scope("prototype")
    public TestBeanA prototypeInstanceA2() {
    System.out.println("prototypeInstanceA2+++");
        return new TestBeanA("prototypeInstanceA for ");
    }
}
