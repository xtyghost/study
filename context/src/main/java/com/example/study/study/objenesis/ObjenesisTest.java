/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ObjenesisTest Author: xutong Date: 2020/6/23 1:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.objenesis;

import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class ObjenesisTest {
  public static void main(String[] args) {
    //
    ObjenesisStd objenesisStd = new ObjenesisStd();
    ObjectInstantiator<MyObject> instantiator = objenesisStd.getInstantiatorOf(MyObject.class);
    System.out.println(instantiator.newInstance().hashCode());
    System.out.println(instantiator.newInstance().getClass());
    System.out.println(instantiator.newInstance().hashCode());
    System.out.println(instantiator.newInstance().hashCode());

  }
}
