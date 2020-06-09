/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MovieCatalogImplA Author: xutong Date: 2020/6/1 5:33
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/1
 * @since 1.0.0
 */
//@Primary
public class MovieCatalogImplA implements MovieCatalog {

  @Autowired
  @Genre("A")
//  @Genre("B")
  private MovieCatalog movieCatalog;

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

    public void setMovieCatalog(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void doSomething(){
    System.out.println(this.hashCode());
    }
}
