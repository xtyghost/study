/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ObjenesisTest Author: xutong Date: 2020/6/23 1:39 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.objenesis;

import org.objenesis.ObjenesisSerializer;
import org.objenesis.instantiator.ObjectInstantiator;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * <p>Fail is the class is not serializable Call the no-arg constructor of the first none
 * serializable class. Just like the serialization would do Externalizable classes won't have a
 * special treatment. If you want one, implement it yourself No serializable specific method is
 * called (e.g. readResolve, readExternal, readObject, readObjectNoData)
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
public class ObjenesisTest2 {

  public static void main(String[] args) {
    //
    ObjenesisSerializer objenesisSerializer = new ObjenesisSerializer();
    ObjectInstantiator<MyObject> of = objenesisSerializer.getInstantiatorOf(MyObject.class);
    System.out.println(of.newInstance().getClass());
  }
}
