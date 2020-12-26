/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Dispatch Author: xutong Date: 2020/10/16 2:21 下午
 * Description: 单分派和多分派 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈单分派和多分派〉
 *
 * @author xutong
 * @create 2020/10/16
 * @since 1.0.0
 */
public class Dispatch {

  static class QQ {}

  static class _360 {}

  public static class Father {
    public void hardChoice(QQ arg) {
      System.out.println("father choose qq");
    }

    public void hardChoice(_360 arg) {
      System.out.println("father choose 360");
    }
  }

  public static class Son extends Father {
    @Override
    public void hardChoice(QQ arg) {
      System.out.println("son choose qq");
    }

    @Override
    public void hardChoice(_360 arg) {
      System.out.println("son choose 360");
    }
  }

  public static void main(String[] args) {
      Father father = new Father();
      Father son = new Son();
      father.hardChoice(new _360());
      son.hardChoice(new QQ());
  }
}
