/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/7/2 9:37 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.beandefinition;

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;

import com.example.study.study.bean.beandefinition.dao.PersonRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/7/2
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    GenericApplicationContext context = new GenericApplicationContext();
    new GroovyBeanDefinitionReader(context)
        .loadBeanDefinitions("beandefinition/services.groovy", "beandefinition/daos.groovy");
    context.refresh();
    //      BeanDefinition bd = this.beanDefinitionMap.get(beanName);
    //      if (bd == null) {
    //          if (logger.isTraceEnabled()) {
    //              logger.trace("No bean named '" + beanName + "' found in " + this);
    //          }
    //          throw new NoSuchBeanDefinitionException(beanName);
    //      }
    // 所有beandefinition都是单例
    AbstractBeanDefinition personDao =
        (AbstractBeanDefinition) context.getBeanDefinition("personDao");
    //      PersonServiceImpl personService = new PersonServiceImpl();
    //      new BeanWrapperImpl(personService).setPropertyValues(personDao.getPropertyValues());
    //    System.out.println(personService);
    personDao.setBeanClassName("personDao");
    personDao.setAbstract(false);
    personDao.setScope("prototype");
    System.out.println(context.getBean("personDao", PersonRepository.class));
  }
}
