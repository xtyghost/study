package com.example.study.study.aspect.aspectj;

/**
 *
 * AOP 代理则可分为静态代理和动态代理两大类，其中静态代理是指使用 AOP 框架提供的命令进行编译，
 * 从而在编译阶段就可生成 AOP 代理类，因此也称为编译时增强；
 * 而动态代理则在运行时借助于 JDK 动态代理、CGLIB 等在内存中“临时”生成 AOP 动态代理类，因此也被称为运行时增强。
 * 静态编译使用特殊的编译器提前编译
 * ajc -d Boot.java LogAspect.aj SayHelloService.java
 *
 * @author xutong
 */
public class Boot {
    public static void main(String[] args) {
        new SayHelloService().say();
    }
}
