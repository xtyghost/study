/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: CapacityTest Author: xutong Date: 2020/11/1 8:57 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package hashMap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/1
 * @since 1.0.0
 */
public class CapacityTest {
  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    //
    HashMap<Object, Object> objectObjectHashMap = new HashMap<>(3);
    Method resize = HashMap.class.getDeclaredMethod("resize");
    resize.setAccessible(true);
    Object[] invoke = (Object[]) resize.invoke(objectObjectHashMap);
    System.out.println("当hashmap设置位奇数是默认当capacity==" + invoke.length);
    objectObjectHashMap.put(null, null);
  }
}
