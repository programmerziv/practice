package com.ziv.observer.c;

import com.ziv.observer.a.Observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    public void update() {
        System.out.println("Hex String"+Integer.toHexString(subject.getState()));
    }
}
