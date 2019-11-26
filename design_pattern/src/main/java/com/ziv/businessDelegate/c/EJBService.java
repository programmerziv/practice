package com.ziv.businessDelegate.c;

import com.ziv.businessDelegate.i.BusinessService;

public class EJBService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
