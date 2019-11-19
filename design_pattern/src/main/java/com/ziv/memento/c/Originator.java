package com.ziv.memento.c;

import com.ziv.memento.c.Memento;

/**
 * 创建并在memento对象中储存状态
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建了一个新的memento，并储存了状态
     * @return
     */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
