package lock.abstractqueuesynchronizer;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author xutong
 */
public class TwinLock implements Lock {
    private Sync sync = new Sync(2);

    public static class Sync extends AbstractQueuedSynchronizer {
        public Sync(int i) {
            this.setState(i);
        }
    }

    @Override
    public void lock() {
        sync.acquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @SneakyThrows
    @Override
    public boolean tryLock() {
        return sync.tryAcquireSharedNanos(1, 0);
    }

    @Override
    public boolean tryLock(long time, @NotNull TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireSharedNanos(1, TimeUnit.DAYS.toNanos(time));
    }

    @Override
    public void unlock() {

    }

    @NotNull
    @Override
    public Condition newCondition() {
        return null;
    }
}
