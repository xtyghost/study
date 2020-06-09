/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: EventConfig Author: xutong Date: 2020/6/5 4:59 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.eventlistener;

import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 〈一句话功能简述〉<br>
 * 〈 spring的标准事件还有：RequestHandledEvent，ServletRequestHandledEvent
 *
 * <p>〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
@EnableAsync
@Configuration
public class EventConfig {
  @Bean
  public ColsedEventListener colsedEventListener() {
    return new ColsedEventListener();
  }

  @Bean
  public StartedEventListener startedEventListener() {
    return new StartedEventListener();
  }

  @Bean
  public RefreshedEventListener refreshedEventListener() {
    return new RefreshedEventListener();
  }

  @Bean
  public StoppedEventListener stoppedEventListener() {
    return new StoppedEventListener();
  }

  //  @Bean
  //  public MyApplicationListener myApplicationListener() {
  //    return new MyApplicationListener();
  //  }

  @Bean
  public MyApplicationListener2 myApplicationListener2() {
    return new MyApplicationListener2();
  }

  @Bean
  public AsyncUncaughtExceptionHandler asyncUncaughtExceptionHandler() {
    return new SimpleAsyncUncaughtExceptionHandler() {
      @Override
      public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        System.out.println("I'm AsyncUncaughtExceptionHandler");
        throw new RuntimeException("I'm a exception come from handleUncaughtException");
      }
    };
  }

  //  @Bean
  //  public AsyncConfigurer asyncConfigurer() {
  //    return new AsyncConfigurer() {
  //      @Override
  //      public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
  //        return asyncUncaughtExceptionHandler();
  //      }
  //    };
  //  }
  @Bean
  public ThreadPoolExecutor threadPoolExecutor() {
    return new ThreadPoolExecutor(
        4,
        10,
        10,
        TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(10),
        r -> {
          Thread thread = new Thread(Thread.currentThread().getThreadGroup(), "xty-thread");
          thread.setUncaughtExceptionHandler(
              (t, e) -> System.out.println("Thread:" + t + "========meet===========" + e));
          return thread;
        },
        new ThreadPoolExecutor.AbortPolicy());
  }

  @Bean
  public TaskExecutor taskExecutor() {
    return task -> threadPoolExecutor().execute(task);
  }
}
