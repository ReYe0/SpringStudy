package com.study._001.main;

import com.study._001.bean.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: SpringStudy
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/6 16:02
 */
public class CreateStage {
    public static void main(String[] args) {
        String conf="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        Stage stage=(Stage)ac.getBean("stage");
        stage.createStage();
    }
}
