/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: EventSource Author: xutong Date: 2020/10/27 3:10 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package thisescape;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/27
 * @since 1.0.0
 */
public class EventSource<T> {
  private final List<T> eventlisteners;

  public EventSource() {
    eventlisteners = new ArrayList<>();
  }

  public synchronized void registerListener(T eventListener) {
    this.eventlisteners.add(eventListener);
    this.notifyAll();
  }

  public synchronized List<T> retrieveListeners() throws InterruptedException {
    List<T> dest = null;
    if (eventlisteners.size() <= 0) {
      this.wait();
    }
    dest = new ArrayList<T>(eventlisteners.size());
    dest.addAll(eventlisteners);
    return dest;
  }
}
