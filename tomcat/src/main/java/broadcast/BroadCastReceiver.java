package broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author xutong
 */
public class BroadCastReceiver {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] buf = new byte[5];
        DatagramPacket db = new DatagramPacket(buf, buf.length);
        try {
            while (true) {
                ds.receive(db);
                System.out.println(new String(buf, StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
