/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AddressValidator
 * Author:   xutong
 * Date:     2020/6/16 5:35 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.validation.nest;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/16
 * @since 1.0.0
 */
public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
    return Address.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}