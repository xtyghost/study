package com.example.study.study.aspect.aspectj;

public aspect LogAspect {
    pointcut logPointcut():execution(void SayHelloService.say());
    after():logPointcut(){
        System.out.println("记录日志 ...");
    }
}
