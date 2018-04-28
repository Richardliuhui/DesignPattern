package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:39
 */
public class Gunner extends RequestHandler {

    public Gunner(RequestHandler requestHandler){
        super(requestHandler);
    }

    @Override
    public String toString() {
        return "炮手";
    }

    @Override
    public void handleRequest(Request request) {
        printHandleMessage(request);
        super.handleRequest(request);
    }
}
