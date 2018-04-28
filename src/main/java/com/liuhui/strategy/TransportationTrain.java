package com.liuhui.strategy;

/**
 * @author liuhui
 * @date 2018-04-28 下午4:03
 */
public class TransportationTrain implements TransportationStrategy{
    @Override
    public void go() {
        System.out.println("坐火车去广州");
    }
}

