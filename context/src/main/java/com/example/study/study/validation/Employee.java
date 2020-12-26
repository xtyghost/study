/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: s Author: xutong Date: 2020/6/12 3:49 下午 Description:
 * History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/12
 * @since 1.0.0
 */
public class Employee {

  private String name;

  private float salary = 123123L;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
