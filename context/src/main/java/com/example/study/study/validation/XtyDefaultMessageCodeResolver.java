/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyDefaultMessageCodeResolver
 * Author:   xutong
 * Date:     2020/6/12 3:30 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.validation;

import java.util.List;

import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodeFormatter;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/12
 * @since 1.0.0
 */
public class XtyDefaultMessageCodeResolver extends DefaultMessageCodesResolver {

    public XtyDefaultMessageCodeResolver() {
        super();
    }

    @Override
    public void setPrefix(String prefix) {
        super.setPrefix(prefix);
    }

    @Override
    protected String getPrefix() {
        return super.getPrefix();
    }

    @Override
    public void setMessageCodeFormatter(MessageCodeFormatter formatter) {
        super.setMessageCodeFormatter(formatter);
    }

    @Override
    public String[] resolveMessageCodes(String errorCode, String objectName) {
        return super.resolveMessageCodes(errorCode, objectName);
    }

    @Override
    public String[] resolveMessageCodes(String errorCode, String objectName, String field, Class<?> fieldType) {
        return super.resolveMessageCodes(errorCode, objectName, field, fieldType);
    }

    @Override
    protected void buildFieldList(String field, List<String> fieldList) {
        super.buildFieldList(field, fieldList);
    }

    @Override
    protected String postProcessMessageCode(String code) {
        return super.postProcessMessageCode(code);
    }
}