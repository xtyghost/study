/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: UserInforPageRequest Author: xutong Date: 2020/11/25
 * 下午2:06 Description: 用户信息列表查询 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package boot.study.validate;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户信息列表查询〉
 *
 * @author xutong
 * @create 2020/11/25
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
public class UserInfoPageRequest {
  @Positive(message = "pageNo必须是正数")
  @NotNull(message = "pageNo不能为空")
  private Integer pageNo;

  @Max(value = 200, message = "pageSize不能大于200")
  @Positive(message = "pageSize必须是正数")
  @NotNull(message = "pageSize不能为空")
  private Integer pageSize;

  private String userLoginName;
  private String userName;
  /** 权限code */
  private String roleCode;

  private String remark;
}
