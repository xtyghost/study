package com.example.study.study.aspect.exception;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author xutong
 */
public class PersonService {

    public void getPerson() {
        this.personFly("dsf");
        System.out.println("get Person");
    }

    private void personFly(String name) {
        System.out.println("oh my god,I can fly");
    }

}