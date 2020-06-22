/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/17 9:41 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation.propertyeditor;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.BeanWrapperImpl;

import com.example.study.study.validation.Company;
import com.example.study.study.validation.Employee;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/17
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
    Company company = new Company();
    company.setManagingDirector(new Employee("wanwu"));
    BeanWrapperImpl beanWrapper = new BeanWrapperImpl(company);
    PropertyEditorSupport propertyEditor =
        new PropertyEditorSupport() {
          @Override
          public void setAsText(String text) throws IllegalArgumentException {
            this.setValue(new Employee(text));
          }
        };
    beanWrapper.registerCustomEditor(Employee.class, propertyEditor);

    beanWrapper.setPropertyValue("managingDirector", "lisu");
    System.out.println(company.getManagingDirector().getName());
  }
}
