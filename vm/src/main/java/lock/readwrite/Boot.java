package lock.readwrite;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author xutong
 */
public class Boot {
    public static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public static ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    public static ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();
    public static volatile boolean update = false;

    public static void main(String[] args) {
        readLock.newCondition().signal();

    }
    public void testBug(){
        Runnable runnable = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                processData();
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    /**
     * 测试锁定升级
     */
    public static void testUpper() {
        readLock.lock();
        writeLock.lock();
        System.out.println(1); //未打印说明不支持锁定升级
        readLock.unlock();
        writeLock.unlock();
    }


    public static void processData() throws InterruptedException {
        readLock.lock();
        TimeUnit.SECONDS.sleep(5);
        if (!update) {
            // 必须先释放读锁
            readLock.unlock();
            // 锁降级从写锁获取到开始
            writeLock.lock();
            try {
                if (!update) {
                    // 准备数据的流程（略）
                    update = true;
                }
                readLock.lock();
            } finally {
                writeLock.unlock();
            }
            // 锁降级完成，写锁降级为读锁
        }
        try {
            // 使用数据的流程（略）
        } finally {
            readLock.unlock();
        }
    }


}
