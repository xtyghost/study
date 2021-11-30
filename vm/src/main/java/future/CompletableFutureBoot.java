package future;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class CompletableFutureBoot {
    public static void main(String[] args) {



        System.out.println(CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "==A====" + LocalDateTime.now());
        }).handleAsync((a, b) -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "==B====" + LocalDateTime.now());
            return a;
        }).thenApply(a -> {
            System.out.println(Thread.currentThread() + "==C====" + LocalDateTime.now());
            return a;
        }).join());

    }

    public static void testJoin() {
        String join = CompletableFuture.supplyAsync(() -> {
            try {
                throw new Exception("df");
            } catch (Exception e) {
                e.printStackTrace();
            }

            return "hello";
        }).exceptionally(ex -> "Error:" + ex.getMessage()).thenCombine(CompletableFuture.supplyAsync(() -> {
            System.out.println("world");
            return "world";
        }), (s1, s2) -> s1 + "" + s2).join();
        System.out.println(join);
    }
}
