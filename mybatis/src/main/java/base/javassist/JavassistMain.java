package base.javassist;

import org.apache.ibatis.javassist.*;

/**
 * @author xutong
 */
public class JavassistMain {
    public static void main(String[] args) throws NotFoundException, CannotCompileException {
        ClassPool cp = ClassPool.getDefault();
        CtClass clazz = cp.makeClass("com.xxs.test.JavassistTest");
        StringBuffer body = null;
        CtField field = new CtField(cp.get("java.lang.String"), "prop", clazz);
        field.setModifiers(Modifier.PRIVATE);
        //设置方法
        CtConstructor ctConstructor = new CtConstructor(new CtClass[]{}, clazz);
        //设置方法体
        body = new StringBuffer();
//        body.append("{}")
    }
}
