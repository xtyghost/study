/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyMessageCodesResolver Author: xutong Date:
 * 2020/6/11 5:52 下午 Description: 自定义的消息代码解析器 History: <author> <time> <version> <desc> 作者姓名 修改时间
 * 版本号 描述
 */
package com.example.study.study.validation;

import org.springframework.validation.MessageCodesResolver;

/**
 * 〈一句话功能简述〉<br>
 * 〈自定义的消息代码解析器〉
 *
 * @author xutong
 * @create 2020/6/11
 * @since 1.0.0
 */
public class XtyMessageCodesResolver implements MessageCodesResolver {
    @Override
    public String[] resolveMessageCodes(String errorCode, String objectName) {
    return new String[0];
    }

    @Override
    public String[] resolveMessageCodes(String errorCode, String objectName, String field, Class<?> fieldType) {
        return new String[0];
    }
}
