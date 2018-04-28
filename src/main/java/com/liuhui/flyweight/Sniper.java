package com.liuhui.flyweight;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:42
 */
public class Sniper implements Shooting {
    @Override
    public void shoot() {
        System.out.println("狙击枪开火了");
    }
}
