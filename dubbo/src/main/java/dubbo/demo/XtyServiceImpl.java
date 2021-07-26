package dubbo.demo;

/**
 * @author xutong
 */
public class XtyServiceImpl implements XtyService {
    @Override
    public String hello(String name) {
        return "yo man Hello, I am" + name;
    }
}
