/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ThisEscape Author: xutong Date: 2020/10/27 3:07 下午
 * Description: this逃逸 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package thisescape;

/**
 * 〈一句话功能简述〉<br>
 * 〈this逃逸〉
 *对象未初始化就被外部对象引用（感觉没意义）
 * https://www.cnblogs.com/jian0110/p/9369096.html
 * @author xutong
 * @create 2020/10/27
 * @since 1.0.0
 */
public class ThisEscape {
  static ThisEscape obj;
  final int i;
  int j = 0;

  public ThisEscape() {
    i = 1;
    j = 1;
    obj = new ThisEscape();
  }

  public static void main(String[] args) {
    Thread threadA =
        new Thread(
                () -> obj = new ThisEscape());
    Thread threadB =
        new Thread(
                () -> {
                  ThisEscape objB = obj;
                  try {
                    System.out.println(objB.j);
                  } catch (Exception e) {
                    System.out.println("发生空指针错误：普通变量j未被初始化");
                  }
                    try {
                        System.out.println(objB.i);
                    } catch (Exception e) {
                        System.out.println("发生空指针错误：final变量i未被初始化");
                    }
                });
//    threadA.start();
    threadB.start();
  }
}
