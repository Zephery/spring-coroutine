package com.spring.coroutine.async;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author wenzhihuai
 * @since 2022/1/26 17:31
 */
@Component
public class AppConfig {
    @Bean(name = "asyncExecutor")
    public Executor asyncExecutor() {
        ThreadFactory threadFactory = Thread.ofVirtual().factory();
        return Executors.newFixedThreadPool(100, threadFactory);
    }
}
