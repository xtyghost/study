/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyApplicationListener
 * Author:   xutong
 * Date:     2020/10/12 10:05 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.async.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/10/12
 * @since 1.0.0
 */
public class XtyApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
    System.out.println("======"+event.getSource());
    }
}