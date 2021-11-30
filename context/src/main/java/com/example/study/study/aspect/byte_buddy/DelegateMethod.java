package com.example.study.study.aspect.byte_buddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;

import static junit.framework.TestCase.assertEquals;
import static net.bytebuddy.matcher.ElementMatchers.*;

/**
 * @author xutong
 */
public class DelegateMethod {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(Bar.sayHelloBar());
        String r = new ByteBuddy()
                .subclass(Foo.class)
                .method(named("sayHelloFoo")
                        .and(isDeclaredBy(Foo.class)
                                .and(returns(String.class))))
                .intercept(MethodDelegation.to(Bar.class))
                .make()
                .load(DelegateMethod.class.getClassLoader())
                .getLoaded()
                .newInstance()
                .sayHelloFoo();
        System.out.println(Bar.sayHelloBar());
        assertEquals(r, Bar.sayHelloBar());
    }
}
