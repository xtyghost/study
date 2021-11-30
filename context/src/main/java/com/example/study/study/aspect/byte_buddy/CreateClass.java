package com.example.study.study.aspect.byte_buddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FieldAccessor;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import org.aspectj.weaver.ast.FieldGetCall;

import java.lang.reflect.Type;

import static junit.framework.TestCase.assertEquals;

/**
 * @author xutong
 */
public class CreateClass {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        testInit();
    }

    public static void testInit() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class<?> type = new ByteBuddy()
//                .subclass(Object.class)
//                .name("Ll").defineField("dsf",String.class)
//                .defineMethod("getLl",String.class).intercept(FieldGet)
//                .make()
//                .load(CreateClass.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
//                .getLoaded();
//        Object o = type.newInstance();
    }

    public static void test() throws IllegalAccessException, InstantiationException {
        DynamicType.Unloaded unloadedType = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.isToString())
                .intercept(FixedValue.value("Hello World ByteBuddy!"))
                .make();
        Class<?> dynamicType = unloadedType.load(CreateClass.class
                        .getClassLoader())
                .getLoaded();

        assertEquals(
                dynamicType.newInstance().toString(), "Hello World ByteBuddy!");
    }
}
