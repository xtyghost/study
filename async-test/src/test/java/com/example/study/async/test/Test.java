/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Test Author: xutong Date: 2020/8/18 10:40 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.test;

import javax.validation.constraints.NotNull;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/8/18
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Test {
  public void notNull(@NotNull String name) {
    System.out.println(name);
  }
  @org.junit.Test
  public void test() {
      notNull(null);
  }
}
