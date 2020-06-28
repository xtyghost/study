/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PersonImpl Author: xutong Date: 2020/6/24 3:42 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxyfactorybean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/24
 * @since 1.0.0
 */
public class PersonImpl implements Person {
  private String name;
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public void sayAge() {
    System.out.println(age);
  }

  @Override
  public void sayName() {
    System.out.println(name);
  }
}
