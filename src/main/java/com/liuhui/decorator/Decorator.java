package com.liuhui.decorator;

/**
 * @author liuhui
 * @date 2018-04-25 下午3:53
 * 装饰模式
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component=component;
    }
    @Override
    public void operator() {
          component.operator();
    }
}
