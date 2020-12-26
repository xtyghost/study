/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/9/23 3:15 下午
 * Description: 获取范型 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈获取范型〉
 *
 * @author xutong
 * @create 2020/9/23
 * @since 1.0.0
 */
public class Boot {
  List<Integer> a;

  public static void main(String[] args) throws NoSuchFieldException {
    Boot boot = new Boot();
    ParameterizedType a =
        (ParameterizedType) boot.getClass().getDeclaredField("a").getGenericType();
    for (Type actualTypeArgument : a.getActualTypeArguments()) {
      System.out.println(actualTypeArgument);
    }
  }
}
