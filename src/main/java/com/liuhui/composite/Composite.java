package com.liuhui.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:02
 * 组合模式
 */
public class Composite extends Component {

    List<Component> list=new ArrayList<Component>();
    @Override
    public void add(Component component) {

        list.add(component);

    }

    @Override
    public void del(Component component) {
       list.remove(component);
    }

    @Override
    public void eachChild() {
        System.out.println(name + "执行了");
        for (Component c : list) {
            c.eachChild();
        }
    }

    public static void main(String[] args) {
        Composite root=new Composite();
        root.name="根节点";
        Composite right=new Composite();
        right.name="右节点";
        Composite left=new Composite();
        left.name="左节点";
        Leaf right1=new Leaf();
        right1.name="右-子节点1";
        Leaf right2=new Leaf();
        right2.name="右-子节点2";
        right.add(right1);
        right.add(right2);
        root.add(right);
        root.add(left);
        root.eachChild();

    }
}
