/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: dsf
 * Author:   xutong
 * Date:     2020/11/3 7:33 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.mvc.result;

import java.util.LinkedHashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/11/3
 * @since 1.0.0
 */
public class ApiErrorResult extends LinkedHashMap<String,Object> {
    private static final String SUCCESS_KEY = "success";
    private static final String CODE_KEY = "code";
    private static final String MESSAGE_KEY =  "message";

    public ApiErrorResult(boolean success, String code, String message) {
        this.put(SUCCESS_KEY,success);
        this.put(CODE_KEY,code);
        this.put(MESSAGE_KEY,message);
    }
}