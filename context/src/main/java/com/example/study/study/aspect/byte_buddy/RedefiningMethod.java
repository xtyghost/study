package com.example.study.study.aspect.byte_buddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.reflect.Modifier;

import static junit.framework.TestCase.assertEquals;
import static net.bytebuddy.matcher.ElementMatchers.named;

/**
 * @author xutong
 */
public class RedefiningMethod {
    public static void main(String[] args) {
        ByteBuddyAgent.install();
        new ByteBuddy()
                .redefine(Foo.class)
                .method(ElementMatchers.named("sayHelloFoo"))
                .intercept(MethodDelegation.to(Foo2.class))
                .make()
                .load(
                        Foo.class.getClassLoader(),
                        ClassReloadingStrategy.fromInstalledAgent());

        Foo f = new Foo();

        String expected = f.sayHelloFoo();
        System.out.println(expected);
    }
}
