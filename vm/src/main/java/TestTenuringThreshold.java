/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TestTenuringThreshold Author: xutong Date: 2020/9/10
 * 11:14 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈测试,对象多次逃过gc会进入老年代〉
 *
 * @author xutong
 * @create 2020/9/10
 * @since 1.0.0
 */
public class TestTenuringThreshold {
  private static final int _1MB = 1024 * 1024;
  /**
   * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
   * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
   *
   * <p>-XX:MaxTenuringThreshold=1 进入老年代的条件
   */
  public static void testTenuringThreshold() {
    byte[] allocation1, allocation2, allocation3, allocation4;
    allocation1 = new byte[_1MB / 4];
    allocation2 = new byte[4 * _1MB];
    allocation3 = new byte[4 * _1MB];
    allocation3 = null;
    allocation3 = new byte[4 * _1MB];
    //    allocation4 = new byte[4 * _1MB]; //  出现一次Minor GC
  }

  public static void main(String[] args) {
    testTenuringThreshold();
  }
}
