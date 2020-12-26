/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ITesterImpl
 * Author:   xutong
 * Date:     2020/9/2 10:53 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.aop.advice.introduction;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/2
 * @since 1.0.0
 */
public class ITesterImpl implements ITester {
    private boolean busyAsTester;

    @Override
    public void testSoftware(){
    System.out.println("I will ensure the quality");
    }
    @Override
    public boolean isBusyAsTester() {
        return busyAsTester;
    }

    public void setBusyAsTester(boolean busyAsTester) {
        this.busyAsTester = busyAsTester;
    }
}