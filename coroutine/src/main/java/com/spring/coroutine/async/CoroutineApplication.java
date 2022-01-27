package com.spring.coroutine.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class CoroutineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoroutineApplication.class, args);
    }

}
