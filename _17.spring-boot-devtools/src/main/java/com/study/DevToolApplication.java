package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevToolApplication {
    @RequestMapping("/")
    String index() {
        String str = new String("12443");
        return "hello spring boot"+str;
    }
    public static void main(String[] args) {
        SpringApplication.run(DevToolApplication.class, args);
    }
}
