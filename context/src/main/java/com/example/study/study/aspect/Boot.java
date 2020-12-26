/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/19 10:17 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.study.study.aspect.entity.User;
import com.example.study.study.aspect.exception.CarNotFindException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 执行顺序
 * [BeforeAdviceAspect][before][lisu][10][sleep]
 * [AroundAdviceAspect][around][before][lisu][10][sleep] lisu 今年 10 喜欢 sleep
 * [AfterThrowingAdviceAspect][afterThrowing][lisu][10][sleep]
 * [AfterThrowingAdviceAspect][afterThrowing2][lisu][10][sleep]
 * [FinallyAdviceAspect][after][lisu][10][sleep]
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) throws CarNotFindException {
    //
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    ctx.scan("com.example.study.study.aspect");
    ctx.register(Config.class);
    ctx.refresh();
      Component2 bean2 = ctx.getBean(Component2.class);
      Component bean = ctx.getBean(Component.class);
    User user = new User();
    user.setAge(10);
    user.setName("lisu");
    bean.getCar(user, "sleep");
//     bean.getCar(user,"sleep","test");
//      bean.getCar(user);
  }
}
