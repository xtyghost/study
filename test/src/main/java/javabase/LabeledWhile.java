/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: LabeledWhile Author: xutong Date: 2020/9/9 2:41 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package javabase;

/**
 * 〈一句话功能简述〉<br>
 * 〈java的标签的使用〉
 *
 * @author xutong
 * @create 2020/9/9
 * @since 1.0.0
 */
public class LabeledWhile {
  public static void main(String[] args) {
    int i = 0;
    outer:
    while (true) {
      System.out.println("Outer while loop");
      while (true) {
        i++;
        System.out.println("i==" + i);
        if (i == 1) {
          System.out.println("continue");
          continue;
        }
        if (i == 3) {
          System.out.println("continue outer");
          continue outer;
        }
        if (i == 5) {
          System.out.println("break");
          break;
        }
        if (i == 7) {
          System.out.println("break outer");
          break outer;
        }
      }
    }
  }
}
