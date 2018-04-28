package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:07
 */
public class Test {
    public static void main(String[] args) {
        Provider provider=new EmailProider();
        provider.produce().send();

    }
}
