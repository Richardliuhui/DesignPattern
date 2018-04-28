package com.liuhui.proxy;

/**
 * @author liuhui
 * @date 2018-04-23 下午6:12
 */
public class Proxy implements Sourceable{
    private Source source;
    public Proxy(){
        this.source=new Source();
    }
    public void before(){
        System.out.println("before");
    }
    @Override
    public void print() {
        before();
        this.source.print();
        after();

    }

    public void after(){
        System.out.println("ofter");
    }

    public static void main(String[] args) {
        Sourceable sourceable=new Proxy();
        sourceable.print();
    }
}
