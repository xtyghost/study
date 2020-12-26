/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: LRUCache Author: xutong Date: 2020/11/2 10:56 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package lrucache;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * 将新插入的数据放到链表头部
 * 当从缓冲中取道数据时，把取道的数据放在表头
 * 当链表满了，把链表尾部数据抛弃
 *
 * @author xutong
 * @create 2020/11/2
 * @since 1.0.0
 */
public class LRUCache {
  private int capacity;
  private Node first;
  private Node last;
  private Map<Integer, Node> map;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    map = new HashMap<>(capacity);
  }

  public int get(int key) {
    Node node = map.get(key);
    if (node == null) {
      return -1;
    }
    moveToHead(node);
    return node.val;
  }

  private void moveToHead(Node node) {
    // 将node从链表中取出
    if (node == first) {
      return;
    } else if (node == last) {
      last.prev.next = null;
      last = last.prev;
    } else {
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }
    // 将node放在表头
    node.prev = first.prev;
    node.next = first;
    first.prev = node;
    first = node;
  }

  public void put(int key, int value) {
    Node node = map.get(key);
    if (node == null) {
      node = new Node();
      node.key = key;
      node.val = value;
      if (map.size() == capacity) {
        removeLast();
      }
      addToHead(node);
      map.put(key, node);
    }
  }

  private void removeLast() {
    map.remove(last.key);
    Node preNode = last.prev;
    if (preNode != null){
        preNode.next = null;
        last = preNode;
    }
  }

    @Override
    public String toString() {
        return super.toString();
    }

    private void addToHead(Node node) {
    if (map.isEmpty()) {
      first = node;
      last = node;
    } else {
      node.next = first;
      first.prev = node;
      first = node;
    }
  }

  class Node {
    int key;
    int val;
    Node prev;
    Node next;
  }
}
