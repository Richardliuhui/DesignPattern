package com.liuhui.observer;

/**
 * @author liuhui
 * @date 2018-04-28 下午3:17
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        subject.attach(new ConcreteObserver());
        subject.change("new state");
    }
}
