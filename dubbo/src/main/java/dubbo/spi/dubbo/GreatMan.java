package dubbo.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author xutong
 */
@SPI("xty")
public interface GreatMan {
    void broadCast();
}
