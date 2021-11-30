package currentpragramer;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public static void main(String[] args) throws InterruptedException {
        Thread waitThread = new Thread(new Wait(), "waitThread");
        Thread notifyThread = new Thread(new Notify(), "notifyThread");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        notifyThread.start();
    }

    static class Wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread()
                                + "flag is true.wait@" + getDateTime());
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(Thread.currentThread() + "flag is false.running" + getDateTime());
            }
        }


    }

    @NotNull
    public static String getDateTime() {
        return LocalDateTime.now().format(formatter);
    }

    static class Notify implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold lock.notify @" + getDateTime());
                lock.notifyAll();
                ;
                flag = false;
                TimeUnit.SECONDS.sleep(5);
            }
            synchronized (lock) {
                System.out.println(Thread.currentThread() + "hold the lock again @" + getDateTime());
                TimeUnit.SECONDS.sleep(5);
            }
        }
    }
}
