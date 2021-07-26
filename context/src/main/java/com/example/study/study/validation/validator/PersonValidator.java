package com.example.study.study.validation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.study.study.validation.Person;

/**
 * 〈一句话功能简述〉<br>
 * 〈人员解析器〉
 *
 * @author xutong
 * @create 2020/6/16
 * @since 1.0.0
 */
public class PersonValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return Person.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
    Person person = Person.class.cast(target);
    if (person.getAge() < 0) {
      errors.rejectValue("age", "negativeValue");
    } else if (person.getAge() > 110) {
      errors.rejectValue("age", "too.darn.old");
    }
  }
}
