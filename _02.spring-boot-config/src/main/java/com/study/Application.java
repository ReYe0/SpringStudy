package com.study;

import com.study.bean.ConfigBean;
import com.study.bean.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
//@EnableConfigurationProperties({ConfigBean.class, TestConfigBean.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);//关闭banner
        app.run(args);
    }
}
