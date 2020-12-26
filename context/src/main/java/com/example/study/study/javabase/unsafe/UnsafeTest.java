/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: UnsafeTest Author: xutong Date: 2020/6/28 9:48 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.javabase.unsafe;

import static sun.nio.ch.IOStatus.normalize;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

import sun.misc.Unsafe;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉 原文链接：https://blog.csdn.net/zyzzxycj/java/article/details/89877863
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
public class UnsafeTest {
  public static void main(String[] args) throws Exception {
    Unsafe unsafe = getUnsafe();
    A a1 = new A();
    A a2 = A.class.newInstance();
    // unsafe.allocateInstance(A.class) 不走构造函数
    A a3 = (A) unsafe.allocateInstance(A.class);
    a1.a();
    System.out.println("a1 = " + a1);
    a2.a();
    System.out.println("a2 = " + a2);
    a3.a();
    System.out.println("a3 = " + a3);
    // Unsafe.objectFieldOffset
    A a = new A();
    System.out.println(a.getAge());
    System.out.println(a.getName());
    Field age = a.getClass().getDeclaredField("age");
    Field name = a.getClass().getDeclaredField("name");
    System.out.println(unsafe.getObject(a, unsafe.objectFieldOffset(name)));
    unsafe.putInt(a, unsafe.objectFieldOffset(age), 42);
    unsafe.putObject(a, unsafe.objectFieldOffset(name), "hello");
    System.out.println(a.getAge());
    System.out.println(a.getName());

    System.out.println("sizeOf(a) = " + sizeOf(a));
    Guard guard = new Guard();
    System.out.println("guard = " + guard.hashCode());
    System.out.println("shallowCopy(guard) = " + shallowCopy(guard).hashCode());
  }

  static Object shallowCopy(Object obj) throws Exception {
    long size = sizeOf(obj);
    long start = toAddress(obj);
    long address = getUnsafe().allocateMemory(size);
    getUnsafe().copyMemory(start, address, size);
    return fromAddress(address);
  }

  static long toAddress(Object obj) throws NoSuchFieldException, IllegalAccessException {
    Object[] array = new Object[] {obj};
    long baseOffset = getUnsafe().arrayBaseOffset(Object[].class);
    return normalize(getUnsafe().getLong(array, baseOffset));
  }

  static Object fromAddress(long address) throws NoSuchFieldException, IllegalAccessException {
    Object[] array = new Object[] {null};
    long baseOffset = getUnsafe().arrayBaseOffset(Object[].class);
    getUnsafe().putLong(array, baseOffset, address);
    return array[0];
  }

  public static long sizeOf(Object o) throws Exception {
    Field f = Unsafe.class.getDeclaredField("theUnsafe");
    f.setAccessible(true);
    Unsafe unsafe = (Unsafe) f.get(null);

    HashSet<Field> fields = new HashSet();
    Class c = o.getClass();
    while (c != Object.class) {
      for (Field field : c.getDeclaredFields()) {
        if ((field.getModifiers() & Modifier.STATIC) == 0) {
          fields.add(field);
        }
      }
      c = c.getSuperclass();
    }

    // get offset
    long maxSize = 0;
    for (Field field : fields) {
      long offset = unsafe.objectFieldOffset(field);
      if (offset > maxSize) {
        maxSize = offset;
      }
    }
    return ((maxSize / 8) + 1) * 8; // padding
  }

  private static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
    Field field = Unsafe.class.getDeclaredField("theUnsafe");
    field.setAccessible(true);
    return (Unsafe) field.get(null);
  }

  static class Guard {
    private int ACCESS_ALLOWED = 1;

    public boolean giveAccess() {
      return 42 == ACCESS_ALLOWED;
    }
  }
}
