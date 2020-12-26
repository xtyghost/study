package com.example.study.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.mvc.service.TalkMessageService;

/**
 * PiceaContoller
 *
 * <p>description.
 *
 * @author : jiangbing.yang
 * @version 0.1
 * @date : 2019/3/26 15:40
 * @company :
 */
@RestController
public class PiceaContoller {

  @Autowired private TalkMessageService talkMessageService;

  @RequestMapping("/testException")
  public String testException() throws Exception {
    talkMessageService.deleteById("12313");
    throw new RuntimeException("testException");
  }
}
