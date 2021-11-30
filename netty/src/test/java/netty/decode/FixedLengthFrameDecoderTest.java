package netty.decode;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FixedLengthFrameDecoderTest {

    @Test
    public void testFramesDecoded() {
        ByteBuf buffer = Unpooled.buffer();
        for (int i = 0; i < 9; i++) {
            buffer.writeByte(i);
        }
        ByteBuf duplicate = buffer.duplicate();
        EmbeddedChannel embeddedChannel = new EmbeddedChannel(new FixedLengthFrameDecoder(3));
        assertTrue(embeddedChannel.writeInbound(duplicate.retain()));
        assertTrue(embeddedChannel.finish());
        ByteBuf read = embeddedChannel.readInbound();
        assertEquals(buffer. readSlice(3), read);
        read.release();
        read = embeddedChannel.readInbound();
        assertEquals(buffer.readSlice(3), read);
        read.release();
        read = embeddedChannel.readInbound();
        assertEquals(buffer.readSlice(3), read);
        read.release();
        assertNull(embeddedChannel.readInbound());
        buffer.release();
    }



}