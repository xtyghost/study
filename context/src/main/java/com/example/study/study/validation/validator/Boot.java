package com.example.study.study.validation.validator;

import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.ValidationUtils;

import com.example.study.study.validation.Person;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/16
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) {
    //
    Person person = new Person();
    person.setAge(4);
    DirectFieldBindingResult person1 = new DirectFieldBindingResult(person, "person");
    ValidationUtils.invokeValidator(new PersonValidator(), person, person1);
    person1
        .getAllErrors()
        .forEach(
            error -> System.out.println(error.getDefaultMessage()));
  }
}
