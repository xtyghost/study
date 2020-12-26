/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Customer Author: xutong Date: 2020/6/16 5:33 下午
 * Description: 客户 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation.nest;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * 〈客户〉
 *
 * @author xutong
 * @create 2020/6/16
 * @since 1.0.0
 */
public class Customer {
  private String firstName;
  private String surname;
  private Address address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getFirstName(), customer.getFirstName()) &&
                Objects.equals(getSurname(), customer.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSurname());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
