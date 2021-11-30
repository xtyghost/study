package thread;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class TheadState {
    static class TimeWaiting implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                TimeUnit.SECONDS.sleep(10);
            }
        }
    }

    static class Waiting implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (TheadState.class) {
                    TheadState.class.wait();
                }
            }
        }
    }

    static class Blocked implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    TimeUnit.SECONDS.sleep(100);
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        new Thread(new TimeWaiting(),"TimeWaiting").start();
        new Thread(new Waiting(),"Waiting").start();
        new Thread(new Blocked(),"Blocked-1").start();
        new Thread(new Blocked(),"Blocked-2").start();
        Thread.currentThread().join();
    }
}
