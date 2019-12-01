package com.ziv.interceptingFilter.c;

import com.ziv.interceptingFilter.i.Filter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
