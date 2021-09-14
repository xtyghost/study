package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xutong
 */
public class Boot {
    public static void main(String[] args) throws InterruptedException {
        //公平锁和非公平锁，解锁是都是按照队列一个一个有序获取锁unparkSuccessor
        //区别在于，新来的线程是否需要判断等待队列hasQueuedPredecessors()
        ReentrantLock reentrantLock = new ReentrantLock(false);
        Thread thread = new Thread(() -> {
            reentrantLock.lock();
            reentrantLock.unlock();
            System.out.println(Thread.currentThread());
        });
        Thread thread2 = new Thread(() -> {
            reentrantLock.lock();
            reentrantLock.unlock();
            System.out.println(Thread.currentThread());
        });
        thread.start();
        thread2.start();
        TimeUnit.SECONDS.sleep(1);
        reentrantLock.lock();
        System.out.println(Thread.currentThread());
        thread.join();
        ReentrantLock reentrantLock1 = new ReentrantLock(true);
        Thread thread1 = new Thread(() -> {
            reentrantLock1.lock();
        });
        thread1.start();
        thread1.join();
        reentrantLock1.lock();
    }
}
