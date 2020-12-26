/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyConstraintValidator Author: xutong Date: 2020/6/18
 * 10:31 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation.constrant;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈bean的约束分为两个部分， 一个@Constraint声明的约束和它的配置属性注释。
 *
 * <p>javax.validation.ConstraintValidator接口的实现，用于实现约束的行为。 集成 第三方的@validated 〉
 *
 * @author xutong
 * @create 2020/6/18
 * @since 1.0.0
 */
public class XtyConstraintValidator implements ConstraintValidator , Validator {
  @Override
  public boolean isValid(Object value, ConstraintValidatorContext context) {
    return false;
  }

    @Override
    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
        return null;
    }

    @Override
    public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> type) {
        return null;
    }

    @Override
    public ExecutableValidator forExecutables() {
        return null;
    }
}
