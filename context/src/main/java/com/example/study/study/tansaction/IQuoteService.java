/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: IQuoteService Author: xutong Date: 2020/9/21 5:01 下午
 * Description: History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package com.example.study.study.tansaction;

import java.time.LocalDateTime;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @create 2020/9/21
 * @since 1.0.0
 */
public interface IQuoteService {
  Quote getQuote();

  Quote getQuoteByDateTime(LocalDateTime localDateTime);

  void saveQuote(Quote quote);

  void updateQuote(Quote quote);
}
