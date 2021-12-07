package threadpoolexecutor.blockingqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author xutong
 */
public class DelayQueueTest {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
        scheduledThreadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
