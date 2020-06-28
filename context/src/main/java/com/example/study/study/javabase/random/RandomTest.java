/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: RandomTest Author: xutong Date: 2020/6/28 9:02 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.javabase.random;

import cn.hutool.core.lang.UUID;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/28
 * @since 1.0.0
 */
public class RandomTest {
  public static void main(String[] args) {
    //
    //      /** The current seed for a ThreadLocalRandom */
    //      @sun.misc.Contended("tlr")
    //      long threadLocalRandomSeed;
    //
    //      /** Probe hash value; nonzero if threadLocalRandomSeed initialized */
    //      @sun.misc.Contended("tlr")
    //      int threadLocalRandomProbe;
    //
    //      /** Secondary seed isolated from public ThreadLocalRandom sequence */
    //      @sun.misc.Contended("tlr")
    //      int threadLocalRandomSecondarySeed;
    //      final Random ng = isSecure ? Holder.numberGenerator : RandomUtil.getRandom();
    System.out.println(UUID.fastUUID());
  }
}
