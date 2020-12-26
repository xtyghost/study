/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: StringToEnumConverterFactory Author: xutong Date:
 * 2020/6/17 1:29 下午 Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.validation.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

enum MONTH{
    JANUARY,
    FEBRUARY,
    MARTH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUEST,
    SEPTEMBER,
    OCTORBER,
    NOVEMBER,
    DECEMBER;

}

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/6/17
 * @since 1.0.0
 */
final class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {

  public static void main(String[] args) {
    System.out.println(
        new StringToEnumConverterFactory().getConverter(MONTH.class).convert("OCTORBER").getClass());
  }

  public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
    return new StringToEnumConverter(targetType);
  }

  private final class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

    private Class<T> enumType;

    public StringToEnumConverter(Class<T> enumType) {
      this.enumType = enumType;
    }

    public T convert(String source) {
      return (T) Enum.valueOf(this.enumType, source.trim());
    }
  }
}

