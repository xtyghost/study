/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: InvokeDynamic Author: xutong Date: 2020/10/19 9:20 上午
 * Description: invokeDnamic演示 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package invoke;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * 〈一句话功能简述〉<br>
 * 〈invokeDnamic演示〉
 *
 * @author xutong
 * @create 2020/10/19
 * @since 1.0.0
 */
public class InvokeDynamicTest {

  public static void main(String[] args) throws Throwable {
    //
    INDY_BootstrapMethod().invokeExact("asd");
  }

  private static MethodType MT_BootstrapMethod() {

    return MethodType.fromMethodDescriptorString(
        "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String; Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",
        null);
  }

  private static MethodHandle MH_BootstrapMethod() throws Throwable {
    return MethodHandles.lookup()
        .findStatic(InvokeDynamicTest.class, "BootstrapMethod", MT_BootstrapMethod());
  }

  private static MethodHandle INDY_BootstrapMethod() throws Throwable {

    CallSite cs =
        (CallSite)
            MH_BootstrapMethod()
                .invokeWithArguments(
                    MethodHandles.lookup(),
                    "testMethod",
                    MethodType.fromMethodDescriptorString("(Ljava/lang/String;)V", null));
    return cs.dynamicInvoker();
  }
}
