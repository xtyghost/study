/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ExceptionAndFinally Author: xutong Date: 2020/9/23
 * 2:22 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/23
 * @since 1.0.0
 */
public class ExceptionAndFinally {
  public int inc() {
    int x;
    try {
      x = 1;
      return x;
    } catch (Exception e) {
      x = 2;
      return x;
    } finally {
      x = 3;
    }
  }
}
