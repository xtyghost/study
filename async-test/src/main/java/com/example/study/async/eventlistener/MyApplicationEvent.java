/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: MyApplicationEvent Author: xutong Date: 2020/6/5 3:43
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect.eventlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/5
 * @since 1.0.0
 */
public class MyApplicationEvent<T> extends ApplicationEvent implements ResolvableTypeProvider {

  /**
   * Create a new {@code ApplicationEvent}.
   *
   * @param entity the object on which the event initially occurred or with which the event is
   *     associated (never {@code null})
   */
  public MyApplicationEvent(T entity) {
    super(entity);
  }

  @Override
  public ResolvableType getResolvableType() {

    return ResolvableType.forClassWithGenerics(getClass(), ResolvableType.forInstance(getSource()));
  }
}
