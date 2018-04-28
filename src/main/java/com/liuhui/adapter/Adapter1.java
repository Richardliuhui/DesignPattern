package com.liuhui.adapter;

/**
 * @author liuhui
 * @date 2018-04-23 下午6:01
 */
public class Adapter1 extends Adapee implements Target {
    private Adapee adapee;
    public Adapter1(Adapee adapee){
        this.adapee=adapee;

    }
    @Override
    public void operation2() {
        adapee.operation1();
    }

    public static void main(String[] args) {
        Adapter1 adapter1=new Adapter1(new Adapee());
        adapter1.operation2();
    }
}
