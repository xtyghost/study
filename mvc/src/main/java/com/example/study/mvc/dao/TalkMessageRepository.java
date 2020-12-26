/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: TalkMessageRepository Author: xutong Date: 2020/4/2
 * 11:29 上午 Description: 聊天系统消息实体的dao层 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.mvc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.study.mvc.entity.TalkMessage;

/**
 * 〈一句话功能简述〉<br>
 * 〈聊天系统消息实体的dao层〉
 *
 * @author xutong
 * @create 2020/4/2
 * @since 1.0.0
 */
@Repository
public interface TalkMessageRepository extends JpaRepository<TalkMessage, String> {
  List<TalkMessage> findAllByTime(Double duration);

  List<TalkMessage> findAllByType(String type);

  @Query(
      nativeQuery = true,
      value =
          "select * from plm_talk_message where group_name = :group1 and duration1 >= :duration1 order by duration1 asc ;")
  List<TalkMessage> findAllByGroupNameAndTimeStartsWithOrderByTimeAsc(
      String group1, long duration1);
}
