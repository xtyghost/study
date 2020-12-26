/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DynamicObjectAge Author: xutong Date: 2020/10/20 1:48
 * 下午 Description: 动态对象年龄判断 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈动态对象年龄判断〉
 *
 * <p>VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * <p>-XX:MaxTenuringThreshold=15
 *
 * <p>-XX:+PrintTenuringDistribution
 *
 * @author xutong
 * @create 2020/10/20
 * @since 1.0.0
 */
public class DynamicObjectAge {
  private static final int _1MB = 1024 * 1024;

  public static void testTenuringThreshold2() {}
}
