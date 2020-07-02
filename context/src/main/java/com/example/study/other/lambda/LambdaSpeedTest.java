/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: LambdaSpeedTest Author: xutong Date: 2020/6/30 2:00
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.other.lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.hutool.core.date.StopWatch;
import cn.hutool.core.lang.UUID;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/30
 * @since 1.0.0
 */
public class LambdaSpeedTest {
  public static void main(String[] args) throws InterruptedException {
    //
    ArrayList<Integer> list = new ArrayList<>();
      Random random = new Random(System.currentTimeMillis());
      for (int i = 0; i < 100000; i++) {
          int e = random.nextInt(100);
      System.out.println("e = " + e);
//          UUID.fastUUID();
          list.add(e);
    }
    ThreadPoolExecutor threadPoolExecutor =
        new ThreadPoolExecutor(0, 5, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1));
    CountDownLatch countDownLatch = new CountDownLatch(5);
    threadPoolExecutor.execute(
        () -> {
          System.out.println("foreach time one = " + getTime(list));
          System.out.println("-----------------------------------------");
            countDownLatch.countDown();
        });
    threadPoolExecutor.execute(
        () -> {
          System.out.println("foreach time two = " + getTime(list));
          System.out.println("-----------------------------------------");
            countDownLatch.countDown();
        });
    threadPoolExecutor.execute(
        () -> {
          System.out.println("foreach time three = " + getTime2(list));
          System.out.println("-----------------------------------------");
            countDownLatch.countDown();
        });

    threadPoolExecutor.execute(
        () -> {
          System.out.println("foreach time four = " + getTime3(list));
          System.out.println("-----------------------------------------");
            countDownLatch.countDown();
        });

    threadPoolExecutor.execute(
        () -> {
          System.out.println("foreach time five = " + getTime4(list));
          System.out.println("-----------------------------------------");
          countDownLatch.countDown();
        });
    countDownLatch.await();
      ThreadPoolExecutor executor =
              new ThreadPoolExecutor(1, 5, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1));
    executor.execute(
        () -> {
          System.out.println(
              //                  1、kill -9 pid  直接杀死进程
              //
              //                  2、java.lang.System.exit(int status)
              //
              //            3、java.lang.Runtime.exit(int status)
              //
              //            4、没有非守护线程存活
              "Thread.currentThread().isDaemon() = " + Thread.currentThread().isDaemon());
          System.out.println(11);
        });
  }

  private static long getTime(ArrayList<Integer> list) {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    list.forEach(
        ints -> {
          int current = ints;
        });
    stopWatch.stop();
    return stopWatch.getLastTaskTimeNanos();
  }

  private static long getTime2(ArrayList<Integer> list) {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    for (int i = 0; i < list.size(); i++) {

      int current = list.get(i);
    }
    stopWatch.stop();
    return stopWatch.getLastTaskTimeNanos();
  }

  private static long getTime3(ArrayList<Integer> list) {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    list.stream()
        .forEach(
            ints -> {
              int current = ints;
            });
    stopWatch.stop();
    return stopWatch.getLastTaskTimeNanos();
  }

  private static long getTime4(ArrayList<Integer> list) {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    list.parallelStream()
        .forEach(
            ints -> {
              int current = ints;
            });
    stopWatch.stop();
    return stopWatch.getLastTaskTimeNanos();
  }
}
