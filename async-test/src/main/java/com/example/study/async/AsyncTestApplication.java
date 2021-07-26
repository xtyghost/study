package com.example.study.async;

import com.example.study.async.service.AspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Iterator;

@EnableAsync
@SpringBootApplication
@ImportResource(locations = "classpath:aspect/aspect.xml")
public class AsyncTestApplication {

  @Autowired private ApplicationEventPublisher eventPublisher;
  //
  //  @Bean
  //  public CommandLineRunner eventCommandLineRunner() {
  //    return args -> {
  //      eventPublisher.publishEvent(new MyApplicationEvent("lisu"));
  //    };
  //  }
  @Autowired private AspectService aspectService;

  public static void main(String[] args) {
      ConfigurableApplicationContext run = SpringApplication.run(AsyncTestApplication.class, args);
      Iterator<String> beanNamesIterator = run.getBeanFactory().getBeanNamesIterator();
    while (beanNamesIterator.hasNext()) {
      //
      System.out.println(beanNamesIterator.next());
    }
  }

//  @Bean
//  public CommandLineRunner applicationRunner() {
//    return args -> {
//      aspectService.doTransactionThree();
//    };
//  }
}
