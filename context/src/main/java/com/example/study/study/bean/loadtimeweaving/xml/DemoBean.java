/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: sdf
 * Author:   xutong
 * Date:     2020/9/26 2:15 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.loadtimeweaving.xml;

import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/26
 * @since 1.0.0
 */
public class DemoBean {
    public void run1() {
        System.out.println("run1...");
    }
    public void run2() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("run2...");
    }
}