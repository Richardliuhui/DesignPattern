package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:40
 */
public class Commander {

    private RequestHandler chain;
    public Commander() {
        createChain();
    }

    private void createChain() {
        chain = new Gunner(new Gunny(null));
    }

    public void handleRequest(Request request) {
        chain.handleRequest(request);
    }
}
