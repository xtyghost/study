package jmx.notification;

import javax.management.Notification;
import javax.management.NotificationListener;

/**
 * @author xutong
 */
public class HelloListener implements NotificationListener {
    @Override
    public void handleNotification(Notification notification, Object handback) {
        if (handback instanceof Hello) {
            Hello hello = (Hello) handback;
            hello.printHello(notification.getMessage());
        }
    }
}
