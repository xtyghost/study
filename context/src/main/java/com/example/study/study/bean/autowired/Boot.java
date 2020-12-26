package com.example.study.study.bean.autowired;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public final class Boot {

  public static void main(final String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("autowired/autowired.xml");
    MovieRecommender recommender = ctx.getBean("movieRecommender", MovieRecommender.class);
    Assert.assertEquals(recommender.getMovieCatalogA().getClass(), MovieCatalogImplA.class);
    Assert.assertEquals(recommender.getMovieCatalogB().getClass(), MovieCatalogImplB.class);
    Assert.assertEquals(recommender.getMovieCatalogs().size(), 2);

    // 观察巡回引用
    Assert.assertEquals(
        MovieCatalogImplA.class.cast(recommender.getMovieCatalogA()).getMovieCatalog().getClass(),
        MovieCatalogImplA.class);
    MovieCatalogImplA.class
        .cast(MovieCatalogImplA.class.cast(recommender.getMovieCatalogA()).getMovieCatalog())
        .doSomething();
  }
}
