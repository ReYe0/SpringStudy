package com.study._002.main;

import com.study._002.entity.Instrumentalist;
import com.study._002.entity.OneManBan;
import com.study._002.entity.OneManBan2;
import com.study._002.entity.OneManBan3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Instrumentalist kenny=(Instrumentalist)ac.getBean("kenny");
//        kenny.perform();
//        OneManBan hank = (OneManBan) ac.getBean("hank");
//        hank.perform();
//        OneManBan2 hank2 = (OneManBan2) ac.getBean("hank2");
//        hank2.perform();

        OneManBan3 hank3 = (OneManBan3) ac.getBean("hank3");
        hank3.perform();
    }
}
