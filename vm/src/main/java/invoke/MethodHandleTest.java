package invoke; /**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: invoke.MethodHandleTest Author: xutong Date: 2020/10/19 9:09
 * 上午 Description: MethodHandel基础用法 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * 〈一句话功能简述〉<br>
 * 〈MethodHandel基础用法〉
 *
 * @author xutong
 * @create 2020/10/19
 * @since 1.0.0
 */
public class MethodHandleTest {
  public static void main(String[] args) throws Throwable {
    Object obj = System.currentTimeMillis() / 2 == 0 ? System.out : new ClassA();
    getPrintlnMH(obj).invoke("sdf");
  }

  private static MethodHandle getPrintlnMH(Object reveiver) throws Throwable {
    MethodType mt = MethodType.methodType(void.class, String.class);
    return MethodHandles.lookup().findVirtual(reveiver.getClass(),"println",mt).bindTo(reveiver);
  }

  static class ClassA {
    public void println(String s) {
      System.out.println(s);
    }
  }
}
