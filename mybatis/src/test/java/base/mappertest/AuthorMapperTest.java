package base.mappertest;

import base.entity.Author;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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

    public static void main(String[] args) {
    }

}