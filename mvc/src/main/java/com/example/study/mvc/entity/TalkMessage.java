package com.example.study.mvc.entity;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈plm-talk系统聊天消息实体〉
 *
 * @author xutong
 * @create 2020/3/25
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "plm_talk_message")
@Builder
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class TalkMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  /** 消息的发送方 */
  @Type(type = "json")
  @Column(columnDefinition = "json", name = "from1")
  private PlmTalkUserVo from;
  /** 消息的接收方 */
  @Type(type = "json")
  @Column(columnDefinition = "json", name = "to1")
  private PlmTalkUserVo to;
  /** 消息实体 */
  private String message;
  /** 消息类型,text,Imag,All, */
  @Column(name = "type1")
  private String type;
  /** 接受消息距离现在的时间 */
  @Column(name = "duration1")
  private Double time;
  /** 是否已读 */
  @Column(name = "read1")
  private String read;
  /** 消息分组名称,收件人名称,方便查询 */
  private String groupName;
  /** 存放程序运行中的额外条件 TODO 改爲明確的vo對象 */
  @Transient private Map<String, String> extra;
}
