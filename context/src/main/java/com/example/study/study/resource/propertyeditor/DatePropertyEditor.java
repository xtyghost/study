/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DatePropertyEditor Author: xutong Date: 2020/8/13
 * 9:28 上午 Description: 将string转换为date的编辑器 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号
 * 描述
 */
package com.example.study.study.resource.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈将string转换为date的编辑器〉
 *
 * @author xutong
 * @create 2020/8/13
 * @since 1.0.0
 */
public class DatePropertyEditor extends PropertyEditorSupport {
  private String datePattern;

  public String getDatePattern() {
    return datePattern;
  }

  public void setDatePattern(String datePattern) {
    this.datePattern = datePattern;
  }

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(datePattern);
    Instant instant =
        LocalDate.parse(datePattern, dateTimeFormatter)
            .atStartOfDay(ZoneId.systemDefault())
            .toInstant();
    setValue(Date.from(instant));
  }
}
