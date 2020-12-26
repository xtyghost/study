/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: ErrorFilterController Author: xutong Date: 2020/11/3
 * 7:29 上午 Description: 用来处理filter中的异常 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.mvc.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.mvc.result.ApiErrorResult;

/**
 * 〈一句话功能简述〉<br>
 * 〈用来处理filter中的异常〉
 *
 * @author xutong
 * @create 2020/11/3
 * @since 1.0.0
 */
//@RestController
public class ErrorFilterHandler extends BasicErrorController {
  public ErrorFilterHandler() {
    super(new DefaultErrorAttributes(), new ErrorProperties());
  }

  @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
  @Override
  public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
    Map<String, Object> errorAttributes =
        getErrorAttributes(
            request,
            ErrorAttributeOptions.of(
                ErrorAttributeOptions.Include.EXCEPTION,
                ErrorAttributeOptions.Include.MESSAGE,
                ErrorAttributeOptions.Include.STACK_TRACE,
                ErrorAttributeOptions.Include.BINDING_ERRORS));
    HttpStatus status = getStatus(request);
    // 获取错误信息
    String code = errorAttributes.get("status").toString();
    String message = errorAttributes.get("message").toString();

    ApiErrorResult apiErrorResult = new ApiErrorResult(false, code, message);
    return new ResponseEntity<>(apiErrorResult, status);
  }
}
