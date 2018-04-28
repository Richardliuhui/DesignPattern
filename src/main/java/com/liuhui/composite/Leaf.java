package com.liuhui.composite;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:01
 */
public class Leaf extends Component {
    @Override
    public void add(Component component) {
        System.out.println("add");
    }

    @Override
    public void del(Component component) {
        System.out.println("del");
    }

    @Override
    public void eachChild() {
        System.out.println(name+"执行了");
    }
}
