package boot.study.service;

import boot.study.validate.UserInfoPageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * 测试java validation的测试
 *
 * @author xutong
 */
@Slf4j
@Service
public class ValidateService {

    public void insert(@Valid UserInfoPageRequest request) {
        log.info("do nothing!");
    }
}
