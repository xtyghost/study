package staticclasss;

/**
 * @author xutong
 */
public class StaticBoot {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(StaticBoot2.object);
        Thread.currentThread().join();
    }
}
