package threadpoolexecutor;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class Boot {
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int RUNNING = -1 << COUNT_BITS;
    private static final int SHUTDOWN = 0 << COUNT_BITS;
    private static final int STOP = 1 << COUNT_BITS;
    private static final int TIDYING = 2 << COUNT_BITS;
    private static final int TERMINATED = 3 << COUNT_BITS;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1
                , 1, TimeUnit.DAYS, new ArrayBlockingQueue<Runnable>(100), new ThreadFactory() {
            @Override
            public Thread newThread(@NotNull Runnable r) {
                return new Thread();
            }
        }, new ThreadPoolExecutor.AbortPolicy());
//        threadPoolExecutor.execute();

        System.out.println("RUNNING======{}" + RUNNING);
        System.out.println("SHUTDOWN======{}" + SHUTDOWN);
        System.out.println("STOP======{}" + STOP);
        System.out.println("TIDYING======{}" + TIDYING);
        System.out.println("TERMINATED======{}" + TERMINATED);

    }
}
