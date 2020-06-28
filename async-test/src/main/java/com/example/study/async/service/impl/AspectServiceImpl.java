/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: AspectServiceImpl Author: xutong Date: 2020/6/22 6:24
 * 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.async.service.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.example.study.async.exception.PessimisticLockingFailureException;
import com.example.study.async.service.AspectService;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/22
 * @since 1.0.0
 */
@Service
public class AspectServiceImpl implements AspectService {
  @Override
  public void doTransactionThree() throws PessimisticLockingFailureException {
    System.out.println(Instant.now());
    throw new PessimisticLockingFailureException(Instant.now().toString());
  }
}
