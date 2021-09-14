package dubbo.spi.dubbo;

import org.apache.dubbo.common.Extension;

/**
 * @author xutong
 */
@Extension
public class ExtensionGreatMan implements GreatMan {
    @Override
    public void broadCast() {
        System.out.println("I do like Publish speech");
    }
}
