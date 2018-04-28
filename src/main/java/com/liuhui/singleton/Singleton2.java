package com.liuhui.singleton;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:21
 */
public class Singleton2 {

    private Singleton2(){

    }
    private static  class SingletonFactory{
        private static Singleton2 singleton2=new Singleton2();
    }
    public static Singleton2 getInstance(){
        return SingletonFactory.singleton2;
    }
}
