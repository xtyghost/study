package com.example.study.study.aop.proxyfactorybean;

public interface Lockable {
  void lock();

  void unlock();

  boolean locked();
}
