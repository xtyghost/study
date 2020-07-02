package com.example.study.study.aop.proxy.proxyfactorybean;

public interface Lockable {
  void lock();

  void unlock();

  boolean locked();
}
