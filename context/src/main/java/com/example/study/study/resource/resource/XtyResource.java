/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: XtyResource Author: xutong Date: 2020/6/9 6:11 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.resource.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.springframework.core.io.Resource;

/**
 * 〈一句话功能简述〉<br>
 * 〈spring 使用Resource接口增强了URL功能，可以从多种位置和复杂的数据格式中获取配置信息〉
 *  example:
 *      UrlResource
 *      ClassPathResource
 *      FileSystemResource
 *      ServletContextResource
 *      InputStreamResource
 *      ByteArrayResource
 * @author xutong
 * @create 2020/6/9
 * @since 1.0.0
 */
public class XtyResource implements Resource {

  @Override
  public boolean exists() {
    return false;
  }

  @Override
  public URL getURL() throws IOException {
    return null;
  }

  @Override
  public URI getURI() throws IOException {
    return null;
  }

  @Override
  public File getFile() throws IOException {
    return null;
  }

  @Override
  public long contentLength() throws IOException {
    return 0;
  }

  @Override
  public long lastModified() throws IOException {
    return 0;
  }

  @Override
  public Resource createRelative(String relativePath) throws IOException {
    return null;
  }

  @Override
  public String getFilename() {
    return null;
  }

  @Override
  public String getDescription() {
    return null;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    return null;
  }
}
