package com.study._001.bean;

/**
 * @Description: SpringStudy
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2022/10/6 16:01
 */
public class Stage {
    private Stage(){

    }
    //延迟加载实例
    public static class stageSingletonHolder{
        static Stage instance=new Stage();
    }
    //返回实例
    public static Stage getInstance(){
        return stageSingletonHolder.instance;
    }
    public void createStage(){
        System.out.println("创造一个舞台");
    }
}
