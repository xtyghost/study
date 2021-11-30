package com.example.study.study.aspect.javasist;

import com.example.study.study.aspect.exception.PersonService;
import javassist.*;

/**
 * @author xutong
 */
public class EditClass {
    public static void update() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        String classname = "com.example.study.study.aspect.exception.PersonService";
        CtClass cc = pool.get(classname);

        CtMethod personFly = cc.getDeclaredMethod("personFly");
        personFly.insertBefore("System.out.println(\"起飞之前准备降落伞\" + name);");
        personFly.insertAfter("System.out.println(\"成功落地。。。。\");");
//
//        //新增一个方法
//        CtMethod ctMethod = new CtMethod(CtClass.voidType, "joinFriend", new CtClass[]{}, cc);
//        ctMethod.setModifiers(Modifier.PUBLIC);
//        ctMethod.setBody("{System.out.println(\"i want to be your friend\");}");
//        cc.addMethod(ctMethod);
//
        Object person = cc.toClass().newInstance();
//        Method personFlyMethod = person.getClass().getMethod("personFly");
//        personFlyMethod.invoke(person);
//        Method execute = person.getClass().getMethod("joinFriend");
//        execute.invoke(person);
    }

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.study.study.aspect.exception.PersonService");
            update();
            PersonService  personService = new PersonService();
            personService.getPerson();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
