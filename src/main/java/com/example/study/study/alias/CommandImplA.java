/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CommandImplA
 * Author:   xutong
 * Date:     2020/5/29 9:55 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.alias;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
public class CommandImplA implements Command {

    @Override
    public void execute() {
    System.out.println("I'm A");
    }
}