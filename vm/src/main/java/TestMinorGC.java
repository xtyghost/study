/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TestMinorGC Author: xutong Date: 2020/9/10 10:08 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈测试gc的分配担保机制〉
 *
 * @author xutong
 * @create 2020/9/10
 * @since 1.0.0
 */
public class TestMinorGC {
  private static final int _1MB = 1024 * 1024;
  /**
   * $ java -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 TestMinorGC
   * Heap PSYoungGen total 9216K, used 6979K [0x00000007bf600000, 0x00000007c0000000,
   * 0x00000007c0000000) eden space 8192K, 85% used
   * [0x00000007bf600000,0x00000007bfcd0fb0,0x00000007bfe00000) from space 1024K, 0% used
   * [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000) to space 1024K, 0% used
   * [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
   * ParOldGen total 10240K, used 4096K
   * [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000) object space 10240K, 40% used
   * [0x00000007bec00000,0x00000007bf000010,0x00000007bf600000)
   * Metaspace used 2637K, capacity
   * 4486K, committed 4864K, reserved 1056768K class space used 286K, capacity 386K, committed 512K,
   * reserved 1048576K
   */

  /** VM参数: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 */
  public static void testAllocation() {
    byte[] allocation1, allocation2, allocation3, allocation4;
    allocation1 = new byte[2 * _1MB];
    allocation2 = new byte[2 * _1MB];
    allocation3 = new byte[2 * _1MB];
    allocation4 = new byte[4 * _1MB]; //  出现一次Minor GC
//    allocation4 = new byte[4 * _1MB]; //  出现2次Minor GC -XX:MaxTenuringThreshold=1 -XX:PretenureSizeThreshold=2097153
  }

  public static void main(String[] args) {
    testAllocation();
  }
}
