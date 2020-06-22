/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: User Author: xutong Date: 2020/6/19 9:13 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@Data
public class User implements Serializable {
  private String name;
  private Integer age;
  private Car car;
}
