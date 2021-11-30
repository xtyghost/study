package staticclasss;

/**
 * 测试类的静态常量在统一jvm不同进程中是否位置
 * 验证结果object唯一，只会创建一次
 *
 * @author xutong
 */
public class StaticBoot2 {
    public static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(object);
        Thread.currentThread().join();
    }
}
