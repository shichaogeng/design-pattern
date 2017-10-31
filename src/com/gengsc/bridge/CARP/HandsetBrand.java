package com.gengsc.bridge.CARP;

public abstract class HandsetBrand {

    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
