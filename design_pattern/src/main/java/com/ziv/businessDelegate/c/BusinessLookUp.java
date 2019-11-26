package com.ziv.businessDelegate.c;

import com.ziv.businessDelegate.i.BusinessService;

public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
