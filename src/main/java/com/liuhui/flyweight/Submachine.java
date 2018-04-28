package com.liuhui.flyweight;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:43
 */
public class Submachine implements Shooting {
    @Override
    public void shoot() {
        System.out.println("冲锋枪开火了");
    }
}
