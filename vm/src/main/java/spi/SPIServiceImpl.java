package spi;

/**
 * @author xutong
 */
public class SPIServiceImpl implements SPIService {
    @Override
    public void execute() {
        System.out.println("SPIServiceImpl.execute()");
    }
}
