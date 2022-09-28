package com.study.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class TestJsonController {
//    @Autowired
//    ObjectMapper mapper;

    @RequestMapping("/getuser")
    @ResponseBody
    public User getUser() {
        System.out.println("22222222222222");
        User user = new User();
        user.setUserName("mrbird");
        user.setBirthday(new Date());
        System.out.println("33333333333333333");
        return user;
    }
}
