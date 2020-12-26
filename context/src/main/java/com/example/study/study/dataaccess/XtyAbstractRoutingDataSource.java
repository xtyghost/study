/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: XtyAbstractRountingDataSource
 * Author:   xutong
 * Date:     2020/9/15 10:07 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.dataaccess;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/15
 * @since 1.0.0
 */
public class XtyAbstractRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}