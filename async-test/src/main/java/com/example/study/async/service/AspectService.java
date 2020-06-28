/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AspectService Author: xutong Date: 2020/6/22 6:23 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.service;

import com.example.study.async.exception.PessimisticLockingFailureException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/22
 * @since 1.0.0
 */
public interface AspectService {
  void doTransactionThree() throws PessimisticLockingFailureException;
}
