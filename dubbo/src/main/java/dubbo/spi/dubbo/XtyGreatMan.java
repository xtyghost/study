package dubbo.spi.dubbo;

/**
 * @author xutong
 */
public class XtyGreatMan implements GreatMan {
    @Override
    public void broadCast() {
        System.out.println("I do like Publish speech");
    }
}
