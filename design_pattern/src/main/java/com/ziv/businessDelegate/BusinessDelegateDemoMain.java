package com.ziv.businessDelegate;

import com.ziv.businessDelegate.c.BusinessDelegate;
import com.ziv.businessDelegate.c.Client;

public class BusinessDelegateDemoMain {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
