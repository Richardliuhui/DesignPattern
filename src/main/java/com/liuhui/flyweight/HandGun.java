package com.liuhui.flyweight;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:40
 * 手枪
 */
public class HandGun implements Shooting{
    @Override
    public void shoot() {
        System.out.println("手枪开火");
    }
}
