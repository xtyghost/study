/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: FactoryBeanA Author: xutong Date: 2020/5/29 4:57 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */

public class FactoryBeanA implements FactoryBean {

  @Override
  public Object getObject() throws Exception {
      BeanA beanA = new BeanA();
      beanA.setAge(11);
      beanA.setName("lisu");
    System.out.println(beanA.hashCode());
      return beanA;
  }

  @Override
  public Class<?> getObjectType() {
    return BeanA.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
}
