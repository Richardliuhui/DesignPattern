package com.liuhui.observer;

/**
 * @author liuhui
 * @date 2018-04-28 下午3:15
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;
    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("收到状态为："+observerState);
    }
}
