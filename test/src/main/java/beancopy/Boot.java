package beancopy;

import beancopy.convertor.PersonConvertor;
import beancopy.domain.Person;
import beancopy.domain.User;

import java.util.Date;

/**
 * @author xutong
 */
public class Boot {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(123);
        Person person = new Person(12L, "sdf", "sdfs@163.com", new Date(), user);
        PersonConvertor instance = PersonConvertor.INSTANCE;
        System.out.println(instance.domain2dto(person));
        System.out.println(instance.clone(person).getUser() == person.getUser());


    }
}
