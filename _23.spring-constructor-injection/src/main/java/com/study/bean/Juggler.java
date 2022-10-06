package com.study.bean;

import com.study.inter.Performer;

/**
 * @Description: SpringStudy
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/6 15:44
 */
public class Juggler implements Performer {
    private int beanBags=3;

    public Juggler() {

    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() {
        System.out.println("throws "+beanBags+" beanBags");
    }
}
