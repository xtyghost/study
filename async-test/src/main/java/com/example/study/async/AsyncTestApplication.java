package com.example.study.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.study.async.eventlistener.MyApplicationEvent;


@EnableAsync
@SpringBootApplication
public class AsyncTestApplication {

  @Autowired private ApplicationEventPublisher eventPublisher;

  public static void main(String[] args) {
    SpringApplication.run(AsyncTestApplication.class, args);
  }

  @Bean
  public CommandLineRunner eventCommandLineRunner() {
    return args -> {
      eventPublisher.publishEvent(new MyApplicationEvent("lisu"));
    };
  }
}
