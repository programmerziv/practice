package com.ziv.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责从memento中恢复状态
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>(10);

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
