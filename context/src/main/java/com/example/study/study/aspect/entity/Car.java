/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Car Author: xutong Date: 2020/6/19 9:18 上午
 * Description: 车辆 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect.entity;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈车辆〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@Data
public class Car {
  // 品牌
  private String brand;
  // 车牌
  private String license;
}
