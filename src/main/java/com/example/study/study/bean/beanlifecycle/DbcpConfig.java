/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DbcpConfig
 * Author:   xutong
 * Date:     2020/5/29 3:37 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.beanlifecycle;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Configuration
public class DbcpConfig  {
    @Autowired
    private Environment environment;

//    public Environment standardEnvironment(){
//        StandardEnvironment standardEnvironment = new StandardEnvironment();
//        MutablePropertySources propertySources = standardEnvironment.getPropertySources();
//    propertySources.addFirst(new MapPropertySource("default", Collections.singletonMap("jdbc.password","根")));
//    System.out.println("MyEnvironment.hashcode==============="+standardEnvironment.hashCode());
//        return standardEnvironment;
//    }

}