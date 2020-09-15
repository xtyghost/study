/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/9/9 1:19 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.targetsource;

import org.junit.Assert;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.HotSwappableTargetSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/9
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hotswaptargetsource/targetsource.xml");
    Object proxy = ctx.getBean("taskProxy");
    Object target = ((Advised) proxy).getTargetSource().getTarget();

    HotSwappableTargetSource hostSwapTargetSource =
        (HotSwappableTargetSource) ctx.getBean("hotSwapTargetSource");
    Object oldTask =
        hostSwapTargetSource.swap(
            new ITask() {
              @Override
              public void execute() {
                System.out.println("swap task");
              }
            });
    Object newTask = ((Advised) proxy).getTargetSource().getTarget();
    Assert.assertEquals(target,oldTask);
    Assert.assertNotEquals(target,newTask);
  }
}
