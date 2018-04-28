package com.liuhui.command;

/**
 * @author liuhui
 * @date 2018-04-28 上午9:38
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
       this.receiver=receiver;
    }

    public void execute() {
        receiver.action();
    }
}
