package com.yese.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/sleep")
    public String sleep(Integer timeout) throws InterruptedException {
        log.info("begin sleep:{}", timeout);
        for (Integer i = 0; i < timeout; i++) {
            // 模拟业务耗时处理流程
            TimeUnit.SECONDS.sleep(1);
            log.info("i=======>{}", i);
        }
        log.info("end sleep:{}", timeout);
        return "sleep:" + timeout;
    }
}