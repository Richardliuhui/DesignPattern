package com.liuhui.singleton;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:18
 */
public class Singleton1 {
    private static Singleton1 singleton1=null;
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if(null==singleton1){
            synchronized (Singleton1.class){
                if(null==singleton1){
                    singleton1=new Singleton1();
                }
            }
        }
        return singleton1;
    }

}
