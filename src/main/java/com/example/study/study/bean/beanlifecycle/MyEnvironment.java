/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyEnvironment Author: xutong Date: 2020/5/29 4:11 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beanlifecycle;

import java.util.Collections;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class MyEnvironment extends StandardEnvironment {
  public MyEnvironment() {
    super();
    MutablePropertySources propertySources = this.getPropertySources();
    propertySources.addFirst(
        new MapPropertySource("default", Collections.singletonMap("jdbc.password", "根")));
  }
}
