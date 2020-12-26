/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyBanNameAutoProxyCreator Author: xutong Date:
 * 2020/6/30 5:48 下午 Description: beandefination的代理 History: <author> <time> <version> <desc> 作者姓名
 * 修改时间 版本号 描述
 */
package com.example.study.study.aop.proxy.autoproxy;

import javax.annotation.PostConstruct;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;

/**
 * 〈一句话功能简述〉<br>
 * 〈beanDefinition的代理〉
 *
 * @author xutong
 * @create 2020/6/30
 * @since 1.0.0
 */
public class XtyBanNameAutoProxyCreator extends BeanNameAutoProxyCreator {

  public XtyBanNameAutoProxyCreator() {
    super();
  }

  @Override
  public void setBeanNames(String... beanNames) {
    super.setBeanNames(beanNames);
  }

  @Override
  protected Object[] getAdvicesAndAdvisorsForBean(
      Class<?> beanClass, String beanName, TargetSource targetSource) {
    return super.getAdvicesAndAdvisorsForBean(beanClass, beanName, targetSource);
  }

  @Override
  protected boolean isMatch(String beanName, String mappedName) {
    return super.isMatch(beanName, mappedName);
  }

  @PostConstruct
  public void init() {
      setBeanNames("pojo");
      setInterceptorNames("");
  }
}
