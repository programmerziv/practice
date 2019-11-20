package com.ziv.template.a;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    public final void play(){
        // 初始化
        initialize();
        // 开始
        startPlay();
        // 结束
        endPlay();
    }
}
