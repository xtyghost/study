/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ITesterImpl Author: xutong Date: 2020/9/7 2:19 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.advisor.introductionadvisor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/7
 * @since 1.0.0
 */
public class ITesterImpl implements ITester {
  private boolean busyAsTester;

  @Override
  public boolean isBusyAsTester() {
    return busyAsTester ;
  }

    public void setBusyAsTester(boolean busyAsTester) {
        this.busyAsTester = busyAsTester;
    }

    @Override
  public void testSoftware() {
    System.out.println("I will ensure the qu");
  }
}
