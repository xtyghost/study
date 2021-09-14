package dubbo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xutong
 */
public class SpiBoot {

    public static void main(String[] args) {
//        private static final String PREFIX = "META-INF/services/";
        ServiceLoader<Teacher> load = ServiceLoader.load(Teacher.class);
        Iterator<Teacher> iterator = load.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            teacher.teach();
        }

    }

}
