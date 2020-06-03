/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Test Author: xutong Date: 2020/6/2 11:38 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.autowired.pattern;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/2
 * @since 1.0.0
 */
public class Test {
  @Autowired private Store<String> s1; // <String> qualifier, injects the stringStore bean

  @Autowired private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean
  @Autowired private List<Store<String>> list;

    @Autowired
    @CustomQualifier(format = "A")
    private Store s3;

    public Store getA() {
        return A;
    }

    public void setA(Store a) {
        A = a;
    }

    /***
     * 现根据名称（字段名，name属性），查询，
     * 查不到，根据类型查询（根据类型查询原理和@autowired一致）
     */
    @Resource
    private Store A;

    public List<Store<String>> getList() {
        return list;
    }

    public void setList(List<Store<String>> list) {
        this.list = list;
    }

    public Store<String> getS1() {
    return s1;
  }

  public void setS1(Store<String> s1) {
    this.s1 = s1;
  }

  public Store<Integer> getS2() {
    return s2;
  }

  public void setS2(Store<Integer> s2) {
    this.s2 = s2;
  }

    public Store getS3() {
        return s3;
    }

    public void setS3(Store s3) {
        this.s3 = s3;
    }
}
