package com.study._001.main;

import com.study._001.bean.Juggler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: SpringStudy
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/6 15:51
 */
public class Show {
    public static void main(String[] args) {
        String conf="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        Juggler duke=(Juggler)ac.getBean("duke");
//        Juggler duke=(Juggler)ac.getBean("poeticDuke");
        duke.perform(); //扔了 3 个豆袋子
    }
}
