package com.example.study.study.bean.beanpostprocessor;
/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName:
 * com.example.study.study.bean.beanpostprocessor.SimpleTracingBeanPostProcessor Author: xutong
 * Date: 2020/5/29 11:19 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Component
public class ProxyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if (bean instanceof Messenger) {
      System.out.println("proxy Messenger");
      return new MessengerImpl();
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return bean;
  }

  @Override
  public int getOrder() {
    return HIGHEST_PRECEDENCE;
  }
}
