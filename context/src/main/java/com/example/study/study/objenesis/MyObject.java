/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyObject Author: xutong Date: 2020/6/23 1:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.objenesis;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class MyObject<T> implements Serializable {
  private String name;
  private Integer age;

  public MyObject(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

    public MyObject() {
    System.out.println("MyObject()");
    }

    public void readResolve() {
    System.out.println("readResolve");
  }
}
