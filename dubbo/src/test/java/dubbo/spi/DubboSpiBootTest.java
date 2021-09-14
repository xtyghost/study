package dubbo.spi;

import dubbo.spi.dubbo.GreatMan;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.extension.ExtensionFactory;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DubboSpiBootTest {

    @Test
    public void testDubboSpi() {
        ExtensionLoader<GreatMan> loader = ExtensionLoader.getExtensionLoader(GreatMan.class);

        loader.getExtension("true").broadCast();//获取默认拓展，spi注解value按照，分割的第一个值
        loader.getExtension("xty").broadCast();
        loader.getExtension("normal").broadCast();
        loader.getAdaptiveExtension().broadCast();;
    }

}