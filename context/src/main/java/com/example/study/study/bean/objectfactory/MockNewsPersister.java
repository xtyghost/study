/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MockNewsPersister Author: xutong Date: 2020/8/12
 * 11:18 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.objectfactory;

import org.springframework.beans.factory.ObjectFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/8/12
 * @since 1.0.0
 */
public class MockNewsPersister implements IFXNewsPersister {

  private ObjectFactory<FXNewsBean> newsBeanFactory;

  @Override
  public void persistNews() {
    System.out.println("persist bean:" + getNewsBean());
  }

  public FXNewsBean getNewsBean() {
    return newsBeanFactory.getObject();
  }

  public ObjectFactory<FXNewsBean> getNewsBeanFactory() {
    return newsBeanFactory;
  }

  public void setNewsBeanFactory(ObjectFactory<FXNewsBean> newsBeanFactory) {
    this.newsBeanFactory = newsBeanFactory;
  }
}
