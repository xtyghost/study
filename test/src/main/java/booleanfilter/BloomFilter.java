/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: BloomFilter Author: xutong Date: 2020/11/2 8:18 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package booleanfilter;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * 〈一句话功能简述〉<br>
 * ---首先把所有的缓存key都过一遍过滤器，放数组的对应位置渲染为1，当一个获取时，如果一个key经过hash 算法，查处对应的key没有被渲染过则该key一定不存在缓存中 〈〉
 * 首先需要k个hash函数，每个函数可以把key散列成1个整数 初始化时，需要一个长度为n比特的数组，每个比特位初始化为0
 * 当某个key加入集合时，用k个hash计算处k个散列者，并把数组中对应的比特为置为1
 * 判断某个key是够在集合时，用k个hash计算出k个散列值，并查询数组中对应的比特位，如果所有比特位都是1都是1则认为在集合中
 * https://blog.csdn.net/u014106644/article/details/91491807
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class BloomFilter implements Serializable {
  private final BitSet notebook;
  private final int size;

  public BloomFilter(int size) {
    // 创建一个BitSet位集合
    notebook = new BitSet(size);
    this.size = tableSizeFor(size);
  }

  public static void main(String[] args) {
    BloomFilter fileter = new BloomFilter(70);
    fileter.addCache("1111111111111");
    fileter.addCache("22222af22222222222");
    fileter.addCache("444444444444444");
    fileter.addCache("55555adf55555555");
    fileter.addCache("6666666666666");
    System.out.println(fileter.exist("l"));
    System.out.println(fileter.exist("6666666666666"));
  }

  /** Returns a power of two size for the given target capacity. */
  static final int tableSizeFor(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
  }

  public void addCache(String data) {
    // seed.length决定每个string对应多少个bit位，每位都有一个索引值
    // 给定data，求data字符串的第一个索引值index，如果每个index值对应的bit=false说明，该data值不存在，直接将所有对应bit位置为true
    for (int i = 0; i < 2; i++) {
      System.out.println(hash(data));
      setTrue(hash(data));
    }
  }

  public boolean exist(String data) {
    int index;
    for (int i = 0; i < 2; i++) {
      index = hash(data);
      if (!notebook.get(index)) {
        return false;
      }
    }
    return true;
  }

  private int hash(String data) {
      HashFunction hashFunction = Hashing.murmur3_32();
      return hashFunction.hashString(data,StandardCharsets.UTF_8).asInt() % size;
  }

  private void setTrue(int index) {
    notebook.set(index, true);
  }
}
