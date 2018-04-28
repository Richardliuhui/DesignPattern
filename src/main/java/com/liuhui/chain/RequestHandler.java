package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:32
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next){
        this.next=next;
    }
    public void handleRequest(Request request) {
        if (null != next) {
            next.handleRequest(request);
        }
    }

    public abstract String toString();

    protected void printHandleMessage(Request request) {
        System.out.println(this+"处理消息中，消息内容为："+request);
    }
}
