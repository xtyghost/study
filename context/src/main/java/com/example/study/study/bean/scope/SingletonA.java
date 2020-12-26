/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SingletonA
 * Author:   xutong
 * Date:     2020/5/29 10:37 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.bean.scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/5/29
 * @since 1.0.0
 */
@Component
@Scope(SCOPE_SINGLETON)
public class SingletonA implements Command {

    @Autowired
    private ThreadB threadB;

    @Override
    public void execute() {
        threadB.execute();
    }
}