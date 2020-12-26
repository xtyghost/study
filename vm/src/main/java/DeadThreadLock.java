/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DeadThreadLocak Author: xutong Date: 2020/9/14 5:47
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 〈一句话功能简述〉<br>
 * 〈线程死循环演示〉
 *
 * @author xutong
 * @create 2020/9/14
 * @since 1.0.0
 */
public class DeadThreadLock {
  public static void createBusyThread() {
    Thread thread =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                while (true) {}
              }
            },
            "testBusyThread");
    thread.start();
  }

  /**
   * 线程锁等待演示
   *
   * @param lock
   */
  public static void createLockThread(final Object lock) {
    Thread thread =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                synchronized (lock) {
                  try {
                    lock.wait();
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
                }
              }
            },
            "testLockThread");
    thread.start();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    bufferedReader.readLine();
    createBusyThread();
    bufferedReader.readLine();
    Object o = new Object();
      createLockThread(o);
  }
}
