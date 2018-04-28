package com.liuhui.bridge;

/**
 * @author liuhui
 * @date 2018-04-26 下午2:42
 */
public class MyBridge extends Bridge {
    @Override
    public void run() {
        getSourceable().run();
    }

    public static void main(String[] args) {
        Bridge bridge=new MyBridge();
        SourceSub1 sub1=new SourceSub1();
        bridge.setSourceable(sub1);
        bridge.run();
        SourceSub2 sub2=new SourceSub2();
        bridge.setSourceable(sub2);
        bridge.run();
    }
}
