/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyInitialBean
 * Author:   xutong
 * Date:     2020/10/22 9:24 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.async.initializingbean;

import org.springframework.beans.factory.InitializingBean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试，在configuration中bean的生命周期接口是否可用〉
 *
 * @author xutong
 * @create 2020/10/22
 * @since 1.0.0
 */
public class XtyInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
    System.out.println("XtyInitialBean被调用了======在@configuration中生命周期接口可用");
    }
}