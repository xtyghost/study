package com.example.study.study.objenesis;


import org.springframework.objenesis.ObjenesisStd;
import org.springframework.objenesis.instantiator.ObjectInstantiator;

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
