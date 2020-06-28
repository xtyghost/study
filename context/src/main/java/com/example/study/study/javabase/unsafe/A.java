/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: A Author: xutong Date: 2020/6/28 9:42 上午 Description:
 * History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.javabase.unsafe;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
public class A {
  private static A ao;
  private long a; // not initialized value, default 0
  private String name = "A";
  private int age = 0;

  A() {
    this.a = 1; // initialization
  }

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

  //  public static A getAo() {
  //    return AHolder.ah;
  //  }

  long a() {
    System.out.println(this.a);
    return this.a;
  }

  //  private Object readResolve() {
  //    return this;
  //  }

  //  private A getLazyA() {
  //    if (ao == null) {
  //      synchronized (A.class) {
  //        if (ao == null) {
  //          ao = new A();
  //        }
  //      }
  //    }
  //    return ao;
  //  }
  //
  //  private static class AHolder {
  //    public static final A ah = new A();
  //  }
}
