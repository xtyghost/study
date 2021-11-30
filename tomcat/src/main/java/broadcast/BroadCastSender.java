package broadcast;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author xutong
 */
public class BroadCastSender {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("192.168.1.171");
            DatagramSocket ds = new DatagramSocket();
            String str = "hello";
            DatagramPacket dp = new DatagramPacket(str.getBytes(StandardCharsets.UTF_8), str.getBytes(StandardCharsets.UTF_8).length, ip, 8888);
            ds.send(dp);
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
