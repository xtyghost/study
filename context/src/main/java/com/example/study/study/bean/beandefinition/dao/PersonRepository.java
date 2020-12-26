/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PersonRepostory Author: xutong Date: 2020/7/2 9:41 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beandefinition.dao;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/7/2
 * @since 1.0.0
 */
public class PersonRepository {
  private String name;
  private Integer age;

  @Override
  public String toString() {
    return "PersonRepository{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
