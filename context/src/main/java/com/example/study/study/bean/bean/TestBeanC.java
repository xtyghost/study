/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TestBean Author: xutong Date: 2020/6/3 1:49 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
public class TestBeanC {
  private String name;

    public TestBeanC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
    System.out.println(name);
        this.name = name;
    }
}
