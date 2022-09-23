package com.study.controller;

import com.study.bean.BlogProperties;
import com.study.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;
    @Autowired
    private ConfigBean configBean;
    @RequestMapping("/test1")
    String index1() {
        return blogProperties.getName()+"——"+blogProperties.getTitle();
    }
    @RequestMapping("/test22")
    String index2() {
        return configBean.getName()+"——"+configBean.getTitle();
    }
}
