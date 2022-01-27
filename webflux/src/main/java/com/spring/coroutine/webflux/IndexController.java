package com.spring.coroutine.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;

/**
 * @author wenzhihuai
 * @since 2022/1/26 17:22
 */
@RestController
public class IndexController {

    @GetMapping("/webflux")
    public Mono<String> webflux() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(5);
        return Mono.just("success");
    }
}
