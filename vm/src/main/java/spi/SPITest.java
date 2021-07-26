package spi;

import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xutong
 */
public class SPITest {
    public static void main(String[] args) {
        Iterator<SPIService> providers = Service.providers(SPIService.class);
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        while (providers.hasNext()) {
            SPIService next = providers.next();
            next.execute();
        }
        System.out.println("------------------");
        Iterator<SPIService> iterator = load.iterator();
        while (iterator.hasNext()) {
            SPIService next = iterator.next();
            next.execute();
        }
    }
}
