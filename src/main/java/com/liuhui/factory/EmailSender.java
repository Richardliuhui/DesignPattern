package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午4:52
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("email send");
    }
}
