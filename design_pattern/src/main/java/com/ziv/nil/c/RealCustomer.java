package com.ziv.nil.c;

import com.ziv.nil.a.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    public boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
