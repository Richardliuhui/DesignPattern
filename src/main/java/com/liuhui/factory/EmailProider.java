package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:06
 */
public class EmailProider implements Provider {
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
