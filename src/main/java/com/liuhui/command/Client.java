package com.liuhui.command;

/**
 * @author liuhui
 * @date 2018-04-28 上午9:41
 */
public class Client {
    public static void main(String[] args) {
        Command command=new ConcreteCommand(new Receiver());
        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}
