/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyLoadTimeBean Author: xutong Date: 2020/6/5 12:54 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.loadtimeweaving;

import java.lang.instrument.ClassFileTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.LoadTimeWeaver;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class MyLoadTimeBean implements LoadTimeWeaver {
  @Autowired private InnerBean innerBean;

    public InnerBean getInnerBean() {
        return innerBean;
    }

    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }

    @Override
  public void addTransformer(ClassFileTransformer transformer) {}

  @Override
  public ClassLoader getInstrumentableClassLoader() {
    return this.getClass().getClassLoader();
  }

  @Override
  public ClassLoader getThrowawayClassLoader() {
    return this.getClass().getClassLoader();
  }
}
