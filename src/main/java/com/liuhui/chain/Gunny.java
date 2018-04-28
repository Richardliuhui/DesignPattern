package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:37
 */
public class Gunny extends RequestHandler {

    public Gunny(RequestHandler handler){
        super(handler);
    }
    @Override
    public String toString() {
        return "长枪跑";
    }

    @Override
    public void handleRequest(Request request) {
        printHandleMessage(request);
        super.handleRequest(request);
    }
}
