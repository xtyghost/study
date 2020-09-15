/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MyWebApplicationInitializer
 * Author:   xutong
 * Date:     2020/8/4 9:21 上午
 * Description: the example of the java configuration registers and initializes the DispatcherServlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈the example of the java configuration registers and initializes the DispatcherServlet
 *   which is auto detected by the Servlet container
 *  〉
 *
 * @author xutong
 * @create 2020/8/4
 * @since 1.0.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext wc = new AnnotationConfigWebApplicationContext();
//        wc.register(AppConfig.class);
        wc.refresh();
        // create and register the DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(wc);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
    }
}