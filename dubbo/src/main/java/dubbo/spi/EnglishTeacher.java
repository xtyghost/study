package dubbo.spi;

/**
 * @author xutong
 */

public  class EnglishTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("english is the beat language in the world");
    }
}
