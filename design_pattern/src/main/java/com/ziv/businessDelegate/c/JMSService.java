package com.ziv.businessDelegate.c;

import com.ziv.businessDelegate.i.BusinessService;

public class JMSService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by JMS Service");
    }
}
