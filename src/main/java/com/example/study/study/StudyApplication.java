package com.example.study.study;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.study.study.alias.Command;
import com.example.study.study.alias.CommandImplC;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Autowired
    private Map<String ,Command> commandMap;
    @Autowired
    private CommandImplC commandImplC;
    @Bean
    public CommandLineRunner commandLineRunner1(){
    return args ->{
        commandMap.forEach(
                (k, v) -> {
                    System.out.println(k+"============="+v);
                    v.execute();
                });
        commandImplC.command().execute();
    };
    }
}
