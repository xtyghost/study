##理解时间轮算法
* 时间轮算法一种任务调度算法，jdk的timer和delayQueue的插入和删除操作均为O(nlog(n)) 而基于时间轮算法实现的定时器可以把插入和删除的时间复杂度将为）(1)
* 时间轮由多个时间格组成，每个时间格代表基本时间跨度（tickMs),wheelSize==totalInterval * tickMs
* ![](../../../resources/img/timewheel1.jpg)
###kafka时间轮实现
```

```