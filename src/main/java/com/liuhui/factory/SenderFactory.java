package com.liuhui.factory;

/**
 * @author liuhui
 * @date 2018-04-23 下午4:59
 */
public class SenderFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new EmailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    public Sender produceMail(){
        return new EmailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SenderFactory factory=new SenderFactory();
        Sender sender=factory.produce("sms");
        sender.send();
        Sender sender1=factory.produceMail();
        sender1.send();
    }
}
