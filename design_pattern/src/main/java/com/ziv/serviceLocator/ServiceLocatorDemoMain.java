package com.ziv.serviceLocator;

import com.ziv.serviceLocator.c.ServiceLocader;
import com.ziv.serviceLocator.i.Service;

public class ServiceLocatorDemoMain {

    public static void main(String[] args) {
        Service service = ServiceLocader.getService("Service1");
        service.execute();
        service = ServiceLocader.getService("Service2");
        service.execute();
        System.out.println("===================================");
        service = ServiceLocader.getService("Service1");
        service.execute();
        service = ServiceLocader.getService("Service2");
        service.execute();

    }

}
