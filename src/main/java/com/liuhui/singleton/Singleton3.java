package com.liuhui.singleton;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:26
 */
public class Singleton3 {
    private static Singleton3 singleton3=new Singleton3();
    private Singleton3(){
    }
    public Singleton3 getInstance(){
        return singleton3;
    }
}
