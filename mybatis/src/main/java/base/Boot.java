/**
 * Copyright (C), 2015-2020, XXX有限公司 FileName: Boot Author: xutong Date: 2020/9/25 5:39 下午
 * Description: 简单的手动加载mybatis History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package base;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 〈一句话功能简述〉<br>
 * 〈简单的手动加载mybatis〉
 *
 * @author xutong
 * @create 2020/9/25
 * @since 1.0.0
 */
public class Boot {
  public static void main(String[] args) throws IOException {
    //
    String resource = "";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = build.openSession();
    HashMap<String, Object> parameter = new HashMap<>();
    parameter.put("id", 1);
    Object o = sqlSession.selectOne("", parameter);
  }
}
