package com.example.logbacktest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LogbacktestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LogbacktestApplication.class, args);
        System.out.println(run.getEnvironment().getProperty("server.port"));
        System.out.println(run.getEnvironment().getProperty("spring.application.name"));
    }

}
