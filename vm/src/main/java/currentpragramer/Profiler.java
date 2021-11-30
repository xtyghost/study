package currentpragramer;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author xutong
 */
public class Profiler {
    private static final ThreadLocal<Long> THREAD_LOCAL = new InheritableThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static final void begin() {
        THREAD_LOCAL.set(System.currentTimeMillis());
    }

    public static final long end() {
        return System.currentTimeMillis() - THREAD_LOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost:" + Profiler.end()+"mills");
    }
}
