/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DynamicDispatch Author: xutong Date: 2020/10/16 9:18
 * 上午 Description: 演示动态分配 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈演示动态分配〉
 *
 * @author xutong
 * @create 2020/10/16
 * @since 1.0.0
 */
public class DynamicDispatch {
  abstract static class Human {
    protected abstract void sayHello();
  }

  static class Man extends Human {
      @Override
      protected void sayHello() {
      System.out.println("hello man");
      }
  }

  static class Woman extends Human {
      @Override
      protected void sayHello() {
      System.out.println("hello woman");
      }
  }

  public static void main(String[] args) {
      Human woman = new Woman();
      Human man = new Man();
      man.sayHello();
      woman.sayHello();
      man= new Woman();
      man.sayHello();
  }
}
