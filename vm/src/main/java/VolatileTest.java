/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: VolatileTest Author: xutong Date: 2020/10/26 7:58 上午
 * Description: volatile变量自增长运算测量 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈volatile变量自增长运算测量〉
 *
 * @author xutong
 * @create 2020/10/26
 * @since 1.0.0
 */
public class VolatileTest {
  private static final int THREADS_COUNT = 20;
  public static volatile int race = 0;

  public static void increase() {
    race++;
  }

  public static void main(String[] args) {
    //
    Thread[] threads = new Thread[THREADS_COUNT];
    for (int i = 0; i < THREADS_COUNT; i++) {
      threads[i] =
          new Thread(
              () -> {
                for (int j = 0; j < 10000; j++) {
                  increase();
                }
              });
      threads[i].start();
    }
    while (Thread.activeCount() > 1){
        Thread.yield();
    }
    System.out.println(race);
  }
}
