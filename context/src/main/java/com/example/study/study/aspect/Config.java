/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Config Author: xutong Date: 2020/6/19 10:18 上午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/19
 * @since 1.0.0
 */
@EnableAspectJAutoProxy
@Configuration
@Import({Component.class,Component2.class})
public class Config {

}
