/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MovieRecommender Author: xutong Date: 2020/6/2 3:30
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.valueresolve;

import org.springframework.beans.factory.annotation.Value;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MovieRecommender {

  private final String catalog;

  public MovieRecommender(@Value("${catalog.name}") String catalog) {
    this.catalog = catalog;
  }

    public String getCatalog() {
        return catalog;
    }
}
