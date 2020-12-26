/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: GenericTypes Author: xutong Date: 2020/10/27 4:08 下午
 * Description: 当泛型遇到重载 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈当泛型遇到重载〉
 *只有jdk6才支持
 * @author xutong
 * @create 2020/10/27
 * @since 1.0.0
 */
public class GenericTypes {

  public static String method(List<String> list) {
    System.out.println("public static  String method");
//    new StringBuffer().append()
    return "";
  }

//  public static int method(List<Integer> list) {
//    System.out.println("public static  String method");
//    return 2;
//  }
}
