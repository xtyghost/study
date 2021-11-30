package guava.moreexecutors;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 当用户现场执行完毕后延迟一段时间关闭jvm
 *
 * @author xutong
 */
public class DelayedShutDownHook {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("async-pool-%d").build();
        ExecutorService executorService = new ThreadPoolExecutor(10, 20, 0, TimeUnit.MINUTES, new LinkedBlockingQueue<>(3000), threadFactory);
        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "@666");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(Thread.currentThread().getName() + "@888");
        MoreExecutors.addDelayedShutdownHook(executorService, 3000, TimeUnit.MILLISECONDS);
    }
}
