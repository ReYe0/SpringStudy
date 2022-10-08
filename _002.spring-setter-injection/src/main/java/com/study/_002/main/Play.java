package com.study._002.main;

import com.study._002.entity.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Instrumentalist kenny=(Instrumentalist)ac.getBean("kenny");
        kenny.perform();
    }
}
