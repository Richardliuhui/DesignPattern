package com.liuhui.decorator;

/**
 * @author liuhui
 * @date 2018-04-25 下午4:01
 */
public class Test {

    public static void main(String[] args) {

        DecoratorA decoratorA=new DecoratorA(new DecoratorB(new DecoratorA(new ConcreteComponent())));
        decoratorA.operator();
    }
}
