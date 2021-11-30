package beancopy.convertor;

import beancopy.domain.Person;
import beancopy.domain.User;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonConvertorTest {
    @Test
    public void test() {
        Person person = new Person(12L, "sdf", "sdfs@163.com", new Date(), new User());
        System.out.println(PersonConvertor.INSTANCE.domain2dto(person));

    }

}