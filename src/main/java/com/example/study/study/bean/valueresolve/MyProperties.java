/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyProperties Author: xutong Date: 2020/6/2 3:51 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.valueresolve;

import java.util.Properties;

import javax.annotation.PostConstruct;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MyProperties extends Properties {
    @PostConstruct
    public void init(){
        put("user.name","lisu");
    }
}
