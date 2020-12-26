/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: URShift
 * Author:   xutong
 * Date:     2020/9/9 9:35 上午
 * Description: 位移运算符的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈位移运算符的使用〉
 *
 * @author xutong
 * @create 2020/9/9
 * @since 1.0.0
 */
public class URShift {
  public static void main(String[] args) {
    int i = -1;
    i >>>= 10;
    System.out.println(i);
    long l = -1;
    l >>>= 10;
    System.out.println(l);
    short s = -1;
    s >>>= 1;
    System.out.println(s);
    byte b = -1;
    b >>>= 10;
    System.out.println(b);
  }
}