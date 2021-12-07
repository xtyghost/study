package com.rickiyang.learn;

import javassist.*;
import lombok.SneakyThrows;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author xutong
 */
public class PreMainTraceAgent {
    public static void premain(String agentArgs, Instrumentation inst) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {
        System.out.println("agentArgs : " + agentArgs);

        inst.addTransformer(new DefineTransformer(), true);
    }

    static class DefineTransformer implements ClassFileTransformer {

        @SneakyThrows
        @Override
        public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
            System.out.println("premain load Class:" + className);
            ClassPool pool = ClassPool.getDefault();
            CtClass template = pool.get("org.apache.rocketmq.spring.core.RocketMQTemplate");
            CtMethod destroy = template.getDeclaredMethod("destroy");
            destroy.setBody("System.out.println(\"lllllll\");");
            if (className.contains("RocketMQTemplate")){
                return template.toBytecode();
            }
            return classfileBuffer;
        }
    }
}
