package com.ziv.memento.c;

/**
 * 包含了要恢复对象的状态
 *
 * 为节省内存可以写成单例
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state){
        this.state = state;
    }
}
