package netty.bytebuff;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

/**
 * @author xutong
 */
public class Boot {
//    public static void main(String[] args) {
//        ByteBuf sf = Unpooled.copiedBuffer("sf", StandardCharsets.UTF_8).retain();
//    }
public static void main(String[] args) {
    System.out.println(String.valueOf(Long.parseLong("14445", 16) % 10));
}
}
