/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PersonServiceImpl Author: xutong Date: 2020/7/2 9:42
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beandefinition.service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/7/2
 * @since 1.0.0
 */
public class PersonServiceImpl implements PersonService {
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
    public String toString() {
        return "PersonServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
