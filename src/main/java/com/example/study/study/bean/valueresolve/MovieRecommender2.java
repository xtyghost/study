/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MovieRecommender Author: xutong Date: 2020/6/2 3:30
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.valueresolve;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/2
 * @since 1.0.0
 */
public class MovieRecommender2 {

  private Map<String, Integer> countOfMoviesPerCatalog;
  private String catalog;
  private  String greedy;
    public MovieRecommender2() {
    }

  public MovieRecommender2(
      @Value("#{{'Thriller': 100, 'Comedy': 300}}") Map<String, Integer> countOfMoviesPerCatalog) {
    this.countOfMoviesPerCatalog = countOfMoviesPerCatalog;
  }

    public Map<String, Integer> getCountOfMoviesPerCatalog() {
        return countOfMoviesPerCatalog;
    }

    public void setCountOfMoviesPerCatalog(Map<String, Integer> countOfMoviesPerCatalog) {
        this.countOfMoviesPerCatalog = countOfMoviesPerCatalog;
    }
    @Autowired(required = false) //指定初始化方法
    public MovieRecommender2(@Value("#{myProperties['user.name'] + 'Catalog' }") String catalog) {
    this.catalog = catalog;
  }

  public String getCatalog() {
    return catalog;
  }

    /**
     * default most greedy construct method
     * @param countOfMoviesPerCatalog
     * @param catalog
     * @param greedy
     */
    @Autowired(required = false) //指定初始化方法,选取最为贪婪的构造方法
    public MovieRecommender2( @Value("#{{'Thriller': 100, 'Comedy': 300}}") Map<String, Integer> countOfMoviesPerCatalog,@Value("#{{'catalog': 'sdf'}.catalog}") String catalog,@Value("#{{'greedy': 'greedy'}.greedy}") String greedy) {
        this.countOfMoviesPerCatalog = countOfMoviesPerCatalog;
        this.catalog = catalog;
        this.greedy = greedy;
    }
}
