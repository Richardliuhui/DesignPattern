package com.liuhui.decorator;

/**
 * @author liuhui
 * @date 2018-04-25 下午3:55
 */
public class DecoratorA extends Decorator{
    public DecoratorA(Component component){
         super(component);
    }
    @Override
    public void operator() {
        System.out.println("operator A");
        super.operator();
    }

}
