package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午4:51
 */
public class SmsSender  implements  Sender{
    @Override
    public void send() {
        System.out.println("sms send");
    }
}
