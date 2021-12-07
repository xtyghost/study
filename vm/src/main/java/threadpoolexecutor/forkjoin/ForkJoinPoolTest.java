package threadpoolexecutor.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;

/**
 * @author xutong
 */
public class ForkJoinPoolTest {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> task = forkJoinPool.submit(new CountTask(1, 4));

        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
