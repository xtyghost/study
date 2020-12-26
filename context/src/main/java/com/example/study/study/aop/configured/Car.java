/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: sdf Author: xutong Date: 2020/6/23 3:56 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aop.configured;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/23
 * @since 1.0.0
 */
@Configurable
@Component
public class Car {
  @Autowired private Engine engine;
  @Autowired private Transmission transmission;

  public void startCar() {
    transmission.setGear(1);
    engine.engineOn();
    System.out.println("Car started");
  }
}
