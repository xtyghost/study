/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: JHSDB_TestCase Author: xutong Date: 2020/9/14 4:33 下午
 * Description: JHSDB使用 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈JHSDB使用〉 -Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 *
 * @author xutong
 * @create 2020/9/14
 * @since 1.0.0
 */
public class JHSDB_TestCase {
  public static void main(String[] args) {
    //
    Test test = new Test();
    test.foo();
  }

  static class Test {
    static ObjectHolder staticObj = new ObjectHolder();
    ObjectHolder instanceObj = new ObjectHolder();

    void foo() {
      ObjectHolder localObj = new ObjectHolder();
      System.out.println("done");
    }
  }

  private static class ObjectHolder {}
}
