/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MbcApplication Author: xutong Date: 2020/8/4 9:20 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/8/4
 * @since 1.0.0
 */
@EnableAsync
@SpringBootApplication
public class MvcApplication {
  public static void main(String[] args) {
    SpringApplication.run(MvcApplication.class, args);
  }
}
