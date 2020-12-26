/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: PathMatcherTest Author: xutong Date: 2020/6/11 8:58
 * 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.resource.pathmatcher;

import org.springframework.util.PatternMatchUtils;
import org.springframework.util.SimpleIdGenerator;
import org.testng.Assert;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/11
 * @since 1.0.0
 */
public class PathMatcherTest {
  public static void main(String[] args) {
    //
    Assert.assertTrue(PatternMatchUtils.simpleMatch("classpath:***.java", "classpath:xty.java"));
    System.out.println(new SimpleIdGenerator().generateId());
  }
}
