package com.liuhui.decorator;

/**
 * @author liuhui
 * @date 2018-04-25 下午3:57
 */
public class DecoratorB extends Decorator {

    public DecoratorB(Component component){
        super(component);
    }
    @Override
    public void operator() {
        System.out.println("operator B");
        super.operator();
    }
}
