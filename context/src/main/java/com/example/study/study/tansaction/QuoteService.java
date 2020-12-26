/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: QuoteService
 * Author:   xutong
 * Date:     2020/9/21 5:03 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.study.study.tansaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/21
 * @since 1.0.0
 */
public class QuoteService implements IQuoteService {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Quote getQuote() {
        return (Quote) getJdbcTemplate().query("",new RowMapper(){
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Quote quote = new Quote();
                return quote;
            }
        });
    }

    @Override
    public Quote getQuoteByDateTime(LocalDateTime localDateTime) {
        throw new RuntimeException();
    }

    @Override
    public void saveQuote(Quote quote) {
        throw new RuntimeException();
    }

    @Override
    public void updateQuote(Quote quote) {
        throw new RuntimeException();
    }
}