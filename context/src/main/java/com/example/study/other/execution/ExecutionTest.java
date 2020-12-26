/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ExecutionTet Author: xutong Date: 2020/6/30 4:01 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.other.execution;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/30
 * @since 1.0.0
 */
public class ExecutionTest {
  public static void main(String[] args) {
    //
    System.out.println(test());
  }

  public static int test() {
    int a = 1;
    try {

      return a;
    } catch (Exception e) {
      a = 2;
    } finally {
      a = 3;
    }
    return a;
  }
}
