package com.ziv.serviceLocator.c;

import com.ziv.serviceLocator.i.Service;

public class Service2 implements Service {
    public String getName() {
        return "Service2";
    }

    public void execute() {
        System.out.println("Executing Service2");
    }
}
