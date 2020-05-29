package com.example.study.study;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.study.study.bean.alias.Command;
import com.example.study.study.bean.alias.CommandImplC;
import com.example.study.study.bean.scope.SingletonA;

@SpringBootApplication
public class StudyApplication {

  @Autowired private Map<String, Command> commandMap;
  @Autowired private CommandImplC commandImplC;
  @Autowired private SingletonA singletonA;

  public static void main(String[] args) {
    SpringApplication.run(StudyApplication.class, args);
  }

//  @Bean
//  public CommandLineRunner commandLineRunner1() {
//    return args -> {
//      commandMap.forEach(
//          (k, v) -> {
//            System.out.println(k + "=============" + v);
//            v.execute();
//          });
//      commandImplC.command().execute();
//    };
//  }

  @Bean
  public CommandLineRunner scopeCommandLineRunner() {
    return args -> {
      singletonA.execute();
      new Thread(() -> {
             singletonA.execute();
      }).start();
    };
  }
}
