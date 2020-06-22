/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: boot Author: xutong Date: 2020/6/11 5:24 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/11
 * @since 1.0.0
 */
public class boot {
  public static void main(String[] args) {
    BeanWrapper company = new BeanWrapperImpl(new Company());
    // setting the company name..
    company.setPropertyValue("name", "Some Company Inc.");
    // ... can also be done like this:
    PropertyValue value = new PropertyValue("name", "Some Company Inc.");
    company.setPropertyValue(value);

    // ok, let's create the director and tie it to the company:
    BeanWrapper jim = new BeanWrapperImpl(new Employee("sdf"));
    jim.setPropertyValue("name", "Jim Stravinsky");
    company.setPropertyValue("managingDirector", jim.getWrappedInstance());

    // retrieving the salary of the managingDirector through the company
    Float salary = (Float) company.getPropertyValue("managingDirector.salary");
    System.out.println(salary);
  }
}
