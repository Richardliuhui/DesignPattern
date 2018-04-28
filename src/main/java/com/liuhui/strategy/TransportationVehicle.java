package com.liuhui.strategy;

/**
 * @author liuhui
 * @date 2018-04-28 下午4:04
 */
public class TransportationVehicle implements TransportationStrategy {
    @Override
    public void go() {
        System.out.println("驾车去广州");
    }
}
