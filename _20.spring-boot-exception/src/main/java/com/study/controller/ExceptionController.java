package com.study.controller;

import com.study.exception.UserNotExistException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class ExceptionController {
    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {
//        throw new RuntimeException("user not exist");
        throw new UserNotExistException(id);
    }
}
