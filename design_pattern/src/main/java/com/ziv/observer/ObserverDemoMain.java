package com.ziv.observer;

import com.ziv.observer.c.BinaryObserver;
import com.ziv.observer.c.HexObserver;
import com.ziv.observer.c.OctalObserver;
import com.ziv.observer.c.Subject;

public class ObserverDemoMain {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // 创建子类被观察者  只需要new就可以了 构造里自动填充进Subject了
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change : 15");
        subject.setState(15);
        subject.notifyAllObservers();
        System.out.println("Second state change : 10");
        subject.setState(10);
        subject.notifyAllObservers();
    }
}
