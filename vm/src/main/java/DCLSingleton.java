/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DCLSingleton Author: xutong Date: 2020/10/26 7:56 上午
 * Description: 观察volatile History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈观察volatile〉
 *
 * @author xutong
 * @create 2020/10/26
 * @since 1.0.0
 */
public class DCLSingleton {

  private static volatile DCLSingleton singleton;

  private DCLSingleton() {}

  public static DCLSingleton getSingleton() {
    if (singleton == null) {
      synchronized (DCLSingleton.class) {
        if (singleton == null) {
          singleton = new DCLSingleton();
        }
      }
    }
    return singleton;
  }

  public static void main(String[] args) {
    DCLSingleton.getSingleton();
  }
}
