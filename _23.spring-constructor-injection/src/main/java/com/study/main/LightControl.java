package com.study.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: SpringStudy
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/6 16:05
 */
public class LightControl {
    public static void main(String[] args) {
        String conf="applicationContext.xml";
        //加载容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
        //关闭容器
        ((ClassPathXmlApplicationContext)ac).close();
    }
}
