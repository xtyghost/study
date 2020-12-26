/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sdf
 * Author:   xutong
 * Date:     2020/9/26 2:20 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.loadtimeweaving.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * https://www.cnblogs.com/wade-luffy/p/6073702.html
 * @author xutong
 * @create 2020/9/26
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:loadtimeweaver/loadtimeweaver.xml");
        DemoBean demoBean = context.getBean(DemoBean.class);
        demoBean.run1();
        demoBean.run2();
    }
}