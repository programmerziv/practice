package com.ziv.interceptingFilter;


import com.ziv.interceptingFilter.c.*;

public class InterceptingFilterDemo {


    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());

        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Cilent cilent = new Cilent();

        cilent.setFilterManager(filterManager);
        cilent.sendRequest("HOME");


    }
}
