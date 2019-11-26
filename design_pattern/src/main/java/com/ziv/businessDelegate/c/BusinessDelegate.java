package com.ziv.businessDelegate.c;

import com.ziv.businessDelegate.i.BusinessService;

public class BusinessDelegate {

    private BusinessLookUp lookUpService = new BusinessLookUp();

    private BusinessService businessService;

    private String serviceType;


    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
