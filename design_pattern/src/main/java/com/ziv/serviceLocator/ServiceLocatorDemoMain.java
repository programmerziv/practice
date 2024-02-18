package com.ziv.serviceLocator;

import com.ziv.serviceLocator.c.ServiceLocader;
import com.ziv.serviceLocator.i.Service;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocatorDemoMain {

    public static void main(String[] args) {
//        Service service = ServiceLocader.getService("Service1");
//        service.execute();
//        service = ServiceLocader.getService("Service2");
//        service.execute();
//        System.out.println("===================================");
//        service = ServiceLocader.getService("Service1");
//        service.execute();
//        service = ServiceLocader.getService("Service2");
//        service.execute();



        String str  = "123";
        String str1 = null;
        boolean contains = str.contains(str1);
        System.out.println(contains);

    }

}
