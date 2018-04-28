package com.liuhui.facade;

/**
 * @author liuhui
 * @date 2018-04-25 下午2:32
 */
public class Facade {
    private ModuleA moduleA;
    private ModuleB moduleB;
    private ModuleC moduleC;

    public Facade(){
        moduleA=new ModuleA();
        moduleB=new ModuleB();
        moduleC=new ModuleC();
    }
    public void test(){
        moduleA.test();
        moduleB.test();
        moduleC.test();
    }

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.test();
    }
}
