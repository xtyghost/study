package base.mappertest;

import base.entity.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorMapperTest {
    @Autowired
    private AuthorMapper authorMapper;

    @Test
    public void testInsert() {
        Author author = new Author();
        for (int i = 0; i < 2; i++) {
            authorMapper.insert(author);
            System.out.println(author);
        }
    }

}