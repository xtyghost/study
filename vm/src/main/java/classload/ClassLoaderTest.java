/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ClassLoaderTest Author: xutong Date: 2020/10/10 1:09
 * 下午 Description: 类加载器测试 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package classload;

import java.io.IOException;
import java.io.InputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈类加载器测试〉
 *
 * @author xutong
 * @create 2020/10/10
 * @since 1.0.0
 */
public class ClassLoaderTest {
  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    //
    ClassLoader loader =
        new ClassLoader() {
          @Override
          public Class<?> loadClass(String name) throws ClassNotFoundException {
            String classFile = name.substring(name.lastIndexOf(".")+1) + ".class";
            InputStream is = getClass().getResourceAsStream(classFile);
            if (is == null) {
              return super.loadClass(name);
            }
            try {
              byte[] bytes = new byte[is.available()];
              is.read(bytes);
              return defineClass(name, bytes, 0, bytes.length);
            } catch (IOException e) {
              e.printStackTrace();
              throw new ClassNotFoundException(name);
            }
          }
        };
      Object obj = loader.loadClass("classload.ClassLoaderTest").newInstance();
    System.out.println(obj.getClass());
    System.out.println(obj instanceof ClassLoaderTest);
  }
}
