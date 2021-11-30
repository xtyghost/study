package thread.interrupt;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
@Slf4j
public class Interrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepRunner = new Thread(new SleepRunner(), "sleepRunner");
        sleepRunner.setDaemon(true);
        Thread busyRunner = new Thread(new BusyRunner(), "busyRunner");
        busyRunner.setDaemon(true);
        sleepRunner.start();
        busyRunner.start();
        TimeUnit.SECONDS.sleep(5);
        sleepRunner.interrupt();
        busyRunner.interrupt();//可能会不起作用，当线程一直繁忙时
        log.info("sleepRunner.interrupted===={};busyRunner.interrupted====={}", sleepRunner.isInterrupted(), busyRunner.isInterrupted());
        TimeUnit.SECONDS.sleep(2);

    }

    static class SleepRunner implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                TimeUnit.SECONDS.sleep(10);
            }
        }


    }

    static class BusyRunner implements Runnable {

        @Override
        public void run() {
            while (true) {

            }
        }
    }
}
