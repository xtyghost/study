package lock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xutong
 */
public class SourceCodeParse {
    private static ReentrantLock reentrantLock = new ReentrantLock(false);

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 1, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(1));
        threadPoolExecutor.execute(()->{
            try {
                reentrantLock.tryLock(1, TimeUnit.MINUTES);
                reentrantLock.unlock();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            reentrantLock.lock();
        });
        reentrantLock.tryLock(1, TimeUnit.DAYS);
        reentrantLock.lock();
    }
}
