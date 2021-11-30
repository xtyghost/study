package thread.deprecated;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class Deprecated {
    public static void main(String[] args) throws InterruptedException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        Thread printThread = new Thread(new Runner(), "printThread");
        printThread.setDaemon(true);
        printThread.start();
        TimeUnit.SECONDS.sleep(3);
        printThread.suspend();
        System.out.println("suspend" + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        printThread.resume();
        System.out.println("resume" + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
        printThread.stop();
        System.out.println("stop" + format.format(new Date()));
        TimeUnit.SECONDS.sleep(3);
    }

    static class Runner implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println(Thread.currentThread().getName() + "run at" + format.format(new Date()));
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
