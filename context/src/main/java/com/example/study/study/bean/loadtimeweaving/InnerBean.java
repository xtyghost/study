/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: InnerBean Author: xutong Date: 2020/6/5 12:57 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.loadtimeweaving;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
@Component
public class InnerBean {
    public void  test(){
    System.out.println("InnerBean");
    }
}
