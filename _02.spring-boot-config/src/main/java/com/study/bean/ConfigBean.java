package com.study.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="mrbird.blog")
@Data
public class ConfigBean {
    private String name;
    private String title;
}
