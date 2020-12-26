/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ThisEscape Author: xutong Date: 2020/10/27 3:07 下午
 * Description: this逃逸 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package thisescape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br>
 * 〈this逃逸〉
 *对象未初始化就被外部对象引用（感觉没意义）
 * @author xutong
 * @create 2020/10/27
 * @since 1.0.0
 */
public class ThisEscape3 {
  final int i;
  int j = 0;

  public ThisEscape3() {
      //final类型的变量,在this泄漏时无法保证final唯一
    new Thread(new Runnable() {
        @Override
        public void run() {
            int w =0;
         while (w<100){
             System.out.println("i========="+i);
             System.out.println("j========="+j);
             try {
                 TimeUnit.MILLISECONDS.sleep(100);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             w++;
         }
        }
    }).start();
      try {
          TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      i = 1;
      j = 1;

  }

  public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    ThisEscape3 thisEscape3 = new ThisEscape3();
      Constructor<ThisEscape3> constructor = ThisEscape3.class.getConstructor();
      constructor.newInstance();
  }
}
