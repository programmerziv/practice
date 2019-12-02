package com.ziv.serviceLocator.c;

import com.ziv.serviceLocator.i.Service;

public class Service1 implements Service {
    public String getName() {
        return "Service1";
    }

    public void execute() {
        System.out.println("Executing Service1");
    }
}
