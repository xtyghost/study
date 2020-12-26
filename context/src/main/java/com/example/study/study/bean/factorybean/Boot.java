package com.example.study.study.bean.factorybean;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public final class Boot {

  public static void main(final String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("factorybean/factorybean.xml");
    BeanA bean = ctx.getBean(BeanA.class);
    BeanA bean2 = ctx.getBean(BeanA.class);
    //        assert bean.hashCode() ==bean2.hashCode();
    Assert.assertEquals(bean, bean2);
  }
}
