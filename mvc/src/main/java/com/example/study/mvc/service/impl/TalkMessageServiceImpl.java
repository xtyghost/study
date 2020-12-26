/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TalkMessageServiceImpl Author: xutong Date: 2020/11/3
 * 7:55 上午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.study.mvc.dao.TalkMessageRepository;
import com.example.study.mvc.service.TalkMessageService;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/3
 * @since 1.0.0
 */
@Service
public class TalkMessageServiceImpl implements TalkMessageService {
  @Autowired private TalkMessageRepository talkMessageRepository;

  @Transactional
  @Override
  public void deleteById(String param) {
    System.out.println(talkMessageRepository.findById(param));

    talkMessageRepository.deleteById(param);
  }
}
