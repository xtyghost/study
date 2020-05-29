/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DerivedTestBean
 * Author:   xutong
 * Date:     2020/5/29 11:03 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.inherit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class DerivedTestBean {
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
        return "DerivedTestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void initialize(){
    System.out.println("DerivedTestBean do something");
    }
}