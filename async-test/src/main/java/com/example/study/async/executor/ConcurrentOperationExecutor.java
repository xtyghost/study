/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: sdf Author: xutong Date: 2020/6/22 6:04 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.executor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

import com.example.study.async.exception.PessimisticLockingFailureException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/22
 * @since 1.0.0
 */
public class ConcurrentOperationExecutor implements Ordered {

  private static final int DEFAULT_MAX_RETRIES = 2;

  private int maxRetries = DEFAULT_MAX_RETRIES;
  private int order = 1;

  public void setMaxRetries(int maxRetries) {
    this.maxRetries = maxRetries;
  }

  public int getOrder() {
    return this.order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public Object doConcurrentOperation(ProceedingJoinPoint pjp, Object test) throws Throwable {
//    System.out.println(test);
    int numAttempts = 0;
    PessimisticLockingFailureException lockFailureException;
    do {
      numAttempts++;
        System.out.println(numAttempts);
        try {
        return pjp.proceed();
      } catch (PessimisticLockingFailureException ex) {
        lockFailureException = ex;
      }
    } while (numAttempts <= this.maxRetries);
    throw lockFailureException;
  }
}
