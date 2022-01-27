package com.spring.coroutine.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author wenzhihuai
 * @since 2022/1/26 17:26
 */
@RestController
public class IndexController {

    @GetMapping
    @Async("asyncExecutor")
    public CompletableFuture<String> success() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(5);
        return CompletableFuture.completedFuture("success");
    }

}
