/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DeadLock Author: xutong Date: 2020/9/15 10:36 上午
 * Description: 测试死锁 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
import java.util.concurrent.TimeUnit;

import lombok.SneakyThrows;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试死锁〉
 *
 * @author xutong
 * @create 2020/9/15
 * @since 1.0.0
 */
public class DeadLock {
  public static void main(String[] args) {
    new Thread(new SynRunnable(1,2),"test1,2").start();
    new Thread(new SynRunnable(2,1),"test2,1").start();
  }

  static class SynRunnable implements Runnable {
    int a, b;

    public SynRunnable(int a, int b) {
      this.a = a;
      this.b = b;
    }

    @SneakyThrows
    @Override
    public void run() {
      synchronized (Integer.valueOf(a)) {
        TimeUnit.SECONDS.sleep(1);
        synchronized (Integer.valueOf(b)) {
          System.out.println("Current Thread finish===" + Thread.currentThread().getName());
        }
      }
    }
  }
}
