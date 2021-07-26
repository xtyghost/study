/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TEst
 * Author:   xutong
 * Date:     2020/8/25 9:14 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈外部类将持有内部类对引用〉
 *
 * @author xutong
 * @create 2020/8/25
 * @since 1.0.0
 */
public class SimpleSerializationTest {
    private String   name="lisu";
    @Test
    public void testHashMap() throws Exception {
    HashMap<String, String> hmap =
        new HashMap<String, String>() {
          {
            put(new String("key"), new String("value"));
            System.out.println(name);
          }
        };

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        out = new ObjectOutputStream(bos);
        out.writeObject(hmap);
        byte[] yourBytes = bos.toByteArray();
        if (out != null) {
            out.close();
        }
        bos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(yourBytes);
        ObjectInput in = null;
        in = new ObjectInputStream(bis);
        Object o = in.readObject();
        bis.close();
        in.close();

        assertEquals(hmap, o);
    }
}