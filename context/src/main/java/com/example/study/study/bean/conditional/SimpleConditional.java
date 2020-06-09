/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: SimpleConditional Author: xutong Date: 2020/6/3 5:43
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.bean.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/3
 * @since 1.0.0
 */
public class SimpleConditional implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
      MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
      if (attrs != null) {
          for (Object value : attrs.get("value")) {
              if (context.getEnvironment().acceptsProfiles(((String[]) value))) {
                  return true;
              }
          }
          return false;
      }
      return true;
  }
}
