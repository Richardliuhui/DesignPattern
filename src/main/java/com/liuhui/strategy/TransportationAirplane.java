package com.liuhui.strategy;

/**
 * @author liuhui
 * @date 2018-04-28 下午4:02
 */
public class TransportationAirplane implements TransportationStrategy {
    @Override
    public void go() {
        System.out.println("乘飞机从北京去广州");
    }
}
