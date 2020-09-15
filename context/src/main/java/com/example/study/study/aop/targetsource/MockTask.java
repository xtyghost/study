/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MockTask
 * Author:   xutong
 * Date:     2020/9/9 1:19 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.targetsource;

import com.example.study.study.aop.advisor.introductionadvisor.ITester;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/9
 * @since 1.0.0
 */
public class MockTask implements ITask {

    @Override
    public void execute() {
    System.out.println("mockTask");
    }
}