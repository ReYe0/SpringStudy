package com.study.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    // 重点
    Logger logger = LoggerFactory.getLogger("LogController");
    @GetMapping("/recommend")
    public String index() {

//        for (int i = 0; i < 10; i++) {
            logger.trace("A TRACE Message");
            logger.debug("A DEBUG Message");
            logger.info("An INFO Message");
            logger.warn("A WARN Message");
            logger.error("An ERROR Message");
//        }

        return "Greetings from Spring Boot!";

    }
}
