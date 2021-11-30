##HashMap
* 基本概念
  ``hashMap数据结构为数组加链表，链表至少8且数组length大于64时会变为红黑树，否则扩容``
  ![img_2.png](img_2.png)
  ``链表至少8时会转为红黑树，小于6时会变会链表``
  ![img_3.png](img_3.png)
* rehash逻辑
``tab扩容两倍，hash(key)/(newCapacity-1),jdk7采用头插入(多线程下会产生环)，jdk8采用尾插入``
![img_1.png](img_1.png)``![img.png](img.png)``
  
* hashmap.get
![img_4.png](img_4.png)
  
* resize
``数据量大于threshold时会触发resize``
![img_5.png](img_5.png)
* put
``jdk7采用分段锁，jdk8采用cas加synized 提高了并发度，缩小了锁的范围``
  ![img_6.png](img_6.png)
  ``Segment对象继承了ReentrantLock``
  ![img_7.png](img_7.png)