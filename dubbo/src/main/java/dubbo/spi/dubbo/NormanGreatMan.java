package dubbo.spi.dubbo;

/**
 * @author xutong
 */
public class NormanGreatMan implements GreatMan {
    @Override
    public void broadCast() {
        System.out.println("I also like Publish speech");
    }
}
