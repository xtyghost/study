/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Post Author: xutong Date: 2020/9/26 5:34 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package base.entity;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/26
 * @since 1.0.0
 */
@Data
public class Post {
  private Integer id;
  private Author author;
  private String content;
}
