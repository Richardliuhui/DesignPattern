package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午5:05
 */
public class SmsProvider implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
