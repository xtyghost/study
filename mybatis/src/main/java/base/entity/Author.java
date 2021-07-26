/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Author Author: xutong Date: 2020/9/26 5:35 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/26
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
  private Integer id;
  private String username;
  private String password;
  private String email;
}
