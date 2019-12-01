package com.ziv.interceptingFilter.c;

import com.ziv.interceptingFilter.i.Filter;

public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating log: " + request);
    }
}
