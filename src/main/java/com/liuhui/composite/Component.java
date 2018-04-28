package com.liuhui.composite;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:00
 */
public abstract class Component {

    String name;

    public abstract void add(Component component);

    public abstract void del(Component component);

    public abstract void eachChild();
}
