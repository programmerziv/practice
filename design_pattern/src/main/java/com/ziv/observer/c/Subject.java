package com.ziv.observer.c;

import com.ziv.observer.a.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<Observer>(10);

    private int state;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
