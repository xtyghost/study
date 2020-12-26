package com.example.study.mvc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** plm的聊天系统的用户对象 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlmTalkUserVo implements Serializable {
  /** 用户的sockId */
  private String id;
  /** 用户主键id */
  private String UserId;
  /** 当前连接中用户的房间ids */
  private String roomIds;
  /** 用户名称 */
  private String name;
  /** 用户ip地址 */
  private String address;
  /** 用户登陆时间 */
  //    @JsonSerialize(using = Date2LongSerializer.class)
  //    @JsonDeserialize(using = Long2DateSerializer.class)
  private LocalDateTime loginTime;
  /** 用户设备类型 */
  private String deviceType;
  /** 用户密码 */
  //    @JsonIgnore
  private String password;
  /** 用户头像 */
  private String avatarUrl;
  /** 用户邮箱 */
  private String email;
  /** 用户类型 */
  private String type;
}
