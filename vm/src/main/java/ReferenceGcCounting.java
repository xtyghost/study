/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ReferenceGcCounting Author: xutong Date: 2020/7/15
 * 10:51 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/7/15
 * @since 1.0.0
 */
public class ReferenceGcCounting {
  private static final int _1MB = 1024 * 1024;
  public Object instance = null;
  private byte[] bigBytes = new byte[2 * _1MB];

  public static void testGc() {
    ReferenceGcCounting referenceGcCountingA = new ReferenceGcCounting();
    ReferenceGcCounting referenceGcCountingB = new ReferenceGcCounting();
    referenceGcCountingA.instance = referenceGcCountingB;
    referenceGcCountingB.instance = referenceGcCountingA;
    referenceGcCountingA = null;
    referenceGcCountingB = null;
    System.gc();
  }

  public static void main(String[] args) {
      testGc();
  }
}
