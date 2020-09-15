/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: DatePropertyEditorRegistrar Author: xutong Date:
 * 2020/8/13 10:01 上午 Description: 将数据类型和转换器绑定 History: <author> <time> <version> <desc> 作者姓名 修改时间
 * 版本号 描述
 */
package com.example.study.study.resource.propertyeditor;

import java.beans.PropertyEditor;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * 〈一句话功能简述〉<br>
 * 〈将数据类型和转换器绑定〉
 *
 * @author xutong
 * @create 2020/8/13
 * @since 1.0.0
 */
public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {
  private PropertyEditor propertyEditor;

  @Override
  public void registerCustomEditors(PropertyEditorRegistry registry) {
    registry.registerCustomEditor(Date.class, propertyEditor);
  }

  public PropertyEditor getPropertyEditor() {
    return propertyEditor;
  }

  public void setPropertyEditor(PropertyEditor propertyEditor) {
    this.propertyEditor = propertyEditor;
  }
}
