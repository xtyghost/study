package com.example.study.async.service.impl;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.example.study.async.service.PiceaService;

/**
 * PiceaServiceImpl
 *
 * <p>description.
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/3/26 15:45
 * @company :
 */
@Service
public class PiceaServiceImpl implements PiceaService {
  @Async
  @Override
  public void asyncTask() throws Exception {
    System.out.println("异步线程，线程名：" + Thread.currentThread().getName());
    System.out.println("异步处理方法-----start-------");
    System.out.println("------------------------在看貂蝉，不要打扰--------------");
    Thread.sleep(1000);
    System.out.println("异步处理方法------end--------");
  }

  @Async
  @Override
  public Future<String> asyncTaskFuture() throws Exception {
    System.out.println("异步线程，线程名：" + Thread.currentThread().getName());
    System.out.println("异步处理方法-----start-------asyncTaskFuture---");
    int k = 1;
    Thread.sleep(1000);
    System.out.println("异步处理方法-----end---------asyncTaskFuture---");
    return new AsyncResult<String>(String.valueOf(k));
  }

  @Async
  @Override
  public Future<String> asyncTaskFuture2() throws Exception {
    System.out.println("异步线程，线程名：" + Thread.currentThread().getName());
    System.out.println("异步处理方法-----start-------asyncTaskFuture-----2---");
    int k = 2;
    System.out.println("异步处理方法-----end---------asyncTaskFuture-----2---");
    return new AsyncResult<String>(String.valueOf(k));
  }
}
