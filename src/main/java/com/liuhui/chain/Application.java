package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:42
 */
public class Application {

    public static void main(String[] args) {
        Commander commander = new Commander();

        commander.handleRequest(new Request("正常航行"));
        commander.handleRequest(new Request("原地待命"));
        commander.handleRequest(new Request("发射驱逐导弹"));
    }
}
