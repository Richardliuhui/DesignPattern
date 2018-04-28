package com.liuhui.strategy;

/**
 * @author liuhui
 * @date 2018-04-28 下午4:06
 */
public class BusinessMan {
    private TransportationStrategy strategy;

    public BusinessMan(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void changetStrategy(TransportationStrategy strategy) {
        this.strategy = strategy;
    }

    public void transport() {
        this.strategy.go();
    }
}
