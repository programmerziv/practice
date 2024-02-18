package com.ziv.interceptingFilter;


import com.ziv.interceptingFilter.c.*;

public class InterceptingFilterDemo {


    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());

        // 此时才添加拦截器  讲道理应该在FilterManager的构造里添加一些默认的拦截器
        // 如果有需要新的拦截器只要实现Filter，然后再在FilterManager里添加就好了
//        filterManager.setFilter(new AuthenticationFilter());
//        filterManager.setFilter(new DebugFilter());
//
//        Cilent cilent = new Cilent();
//
//        cilent.setFilterManager(filterManager);
//        cilent.sendRequest("HOME");

            Integer.valueOf(null);
    }
}
