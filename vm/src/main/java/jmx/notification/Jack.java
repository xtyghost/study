package jmx.notification;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

/**
 * @author xutong
 */
public class Jack extends NotificationBroadcasterSupport implements JackMBean {
    private int seq = 0;

    @Override
    public void hi() {
        //创建一个信息包
        Notification notification = new Notification("jack.hi", this, ++seq, System.currentTimeMillis(), "jack");
        //通知名称；谁发起的通知；序列号；发起通知时间；发起的消息
        sendNotification(notification);
    }
}
