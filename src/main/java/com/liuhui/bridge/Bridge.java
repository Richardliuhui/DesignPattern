package com.liuhui.bridge;

/**
 * @author liuhui
 * @date 2018-04-26 下午2:40
 */
public abstract class Bridge {
    private Sourceable sourceable;

    public abstract void run();

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
