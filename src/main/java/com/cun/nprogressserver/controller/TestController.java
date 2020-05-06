package com.cun.nprogressserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        // 模拟后端数据处理消耗的时间
        Thread.sleep(1000);
        return "hello";
    }

}
