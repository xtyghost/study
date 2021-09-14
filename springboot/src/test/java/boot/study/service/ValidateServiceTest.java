package boot.study.service;

import boot.study.validate.UserInfoPageRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ValidateServiceTest {
    @Autowired
    private ValidateService validateService;

    @Test
    public void testInsert() {
        UserInfoPageRequest request = new UserInfoPageRequest();
        request.setPageNo(-10);
        validateService.insert(request);
    }

}