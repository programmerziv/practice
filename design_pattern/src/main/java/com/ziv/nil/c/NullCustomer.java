package com.ziv.nil.c;

import com.ziv.nil.a.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
