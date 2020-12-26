/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Blog Author: xutong Date: 2020/9/26 5:34 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package base.entity;

import java.util.List;

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
public class Blog {
  private Integer id;
  private String title;
  private Author author;
  private List<Post> posts;
}
