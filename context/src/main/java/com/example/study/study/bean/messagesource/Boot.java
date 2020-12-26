/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/6/5 3:58 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.messagesource;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试spring的国际化〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext("messagesource/messagesource.xml");
    String message = ctx.getMessage("message", null, "Default", Locale.ENGLISH);
    String message_zh = ctx.getMessage("message", null, "Default", Locale.CHINESE);
    Assert.assertEquals("lisu",new String(message.getBytes(StandardCharsets.ISO_8859_1)));
    Assert.assertEquals("李四",new String(message_zh.getBytes(StandardCharsets.ISO_8859_1)));
    Example bean = ctx.getBean(Example.class);
    bean.execute_ch();
    bean.execute_en();
  }
}
