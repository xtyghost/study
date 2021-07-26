package boot.study;

import boot.study.constants.Token;
import boot.study.handler.RateLimitClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author chenpeng
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
public class SpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

    @Autowired
    private RateLimitClient rateLimitClient;
    ExecutorService executorService = Executors.newFixedThreadPool(20);

    /**
     * 测试限流器
     *
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner() throws InterruptedException {
        rateLimitClient.initToken("1");
        TimeUnit.SECONDS.sleep(1);
        return args -> {
            for (int i = 0; i < 20; i++) {
                executorService.execute(() -> {
                    Token token = rateLimitClient.accquireToken("1", 1);
                    log.info("thread==={};token===={}", Thread.currentThread().getName(), token);
                });
            }
        };
    }

}
