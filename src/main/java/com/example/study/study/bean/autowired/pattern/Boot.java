package com.example.study.study.bean.autowired.pattern;

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
    ApplicationContext ctx = new ClassPathXmlApplicationContext("autowired/autowired.xml");
    Test test = ctx.getBean("test", Test.class);
    Assert.assertEquals(StringStore.class, test.getS1().getClass());
    Assert.assertEquals(IntegerStore.class, test.getS2().getClass());
    Assert.assertEquals(BooleanStore.class, test.getS3().getClass());
    Assert.assertEquals(BooleanStore.class, test.getA().getClass());
    Assert.assertEquals(StringStore.class, test.getList().get(0).getClass());
  }
}
