package com.example.study.async;

import com.example.study.async.propertysource.XtyPropertySource;
import com.example.study.async.service.AspectService;
import com.example.study.async.spi.GreatMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Iterator;

@EnableAsync
@SpringBootApplication
@ImportResource(locations = "classpath:aspect/aspect.xml")
public class AsyncTestApplication {

    @Autowired
    private ApplicationEventPublisher eventPublisher;
    //
    //  @Bean
    //  public CommandLineRunner eventCommandLineRunner() {
    //    return args -> {
    //      eventPublisher.publishEvent(new MyApplicationEvent("lisu"));
    //    };
    //  }
    @Autowired
    private AspectService aspectService;
    @Autowired
    private XtyPropertySource xtyPropertySource;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(AsyncTestApplication.class, args);
        Iterator<String> beanNamesIterator = run.getBeanFactory().getBeanNamesIterator();
        while (beanNamesIterator.hasNext()) {
            //
            System.out.println(beanNamesIterator.next());
        }
    }

    @Bean
    public CommandLineRunner propertySource() {
        return args -> {
            System.out.println("验证@propertySource"+xtyPropertySource);
        };
    }
    //  @Bean
//  public CommandLineRunner applicationRunner() {
//    return args -> {
//      aspectService.doTransactionThree();
//    };
//  }
//    @Autowired
//    public GreatMan greatMan;
//
//    @Bean
//    public CommandLineRunner getGreatMan() {
//        return args -> {
//            System.out.println(greatMan.name());
//        };
//    }
}
