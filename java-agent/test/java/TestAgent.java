import javassist.*;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

/**
 * @author xutong
 */
public class TestAgent {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {

        RocketMQTemplate rocketMQTemplate = new RocketMQTemplate();
        rocketMQTemplate.destroy();
    }
}
