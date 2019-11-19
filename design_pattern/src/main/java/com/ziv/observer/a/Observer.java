package com.ziv.observer.a;

import com.ziv.observer.c.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
