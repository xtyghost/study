/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MovieRecommender Author: xutong Date: 2020/6/1 5:30
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.autowired;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/1
 * @since 1.0.0
 */
public class MovieRecommender {
  @Autowired
  @Genre("A")
  private MovieCatalog movieCatalogA;

  private MovieCatalog movieCatalogB;

    public List<MovieCatalog> getMovieCatalogs() {
        return movieCatalogs;
    }

    public void setMovieCatalogs(List<MovieCatalog> movieCatalogs) {
        this.movieCatalogs = movieCatalogs;
    }

    @Autowired private List<MovieCatalog> movieCatalogs;

  @Autowired
  public void setComedyCatalog(@Genre("B") MovieCatalog comedyCatalog) {
    this.movieCatalogB = comedyCatalog;
  }

  public MovieCatalog getMovieCatalogA() {
    return movieCatalogA;
  }

  public void setMovieCatalogA(MovieCatalog movieCatalogA) {
    this.movieCatalogA = movieCatalogA;
  }

  public MovieCatalog getMovieCatalogB() {
    return movieCatalogB;
  }

  public void setMovieCatalogB(MovieCatalog movieCatalogB) {
    this.movieCatalogB = movieCatalogB;
  }
}
