/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TeacherImpl Author: xutong Date: 2020/9/9 10:45 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.proxyfactorybean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/9
 * @since 1.0.0
 */
public class TeacherImpl implements Teacher {

  @Override
  public void teach() {
    System.out.println("teaching English");
  }
}
