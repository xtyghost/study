package dubbo.spi;

/**
 * @author xutong
 */
public class FrenchTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("french is the beat language in the world");
    }
}
