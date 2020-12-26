/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Account Author: xutong Date: 2020/6/23 3:32 下午
 * Description: 账号 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.configured;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * 〈一句话功能简述〉<br>
 * 〈账号〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
@Configurable(preConstruction = true,value = "account")
public class Account {
  private String name;
  private String address;
  @Autowired private Person person;

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
