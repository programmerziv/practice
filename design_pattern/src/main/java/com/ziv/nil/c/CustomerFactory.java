package com.ziv.nil.c;

import com.ziv.nil.a.AbstractCustomer;

public class CustomerFactory {

    // 预先定义好的对象
    public static final String[] names = {"张三","李四","王二麻子"};

    public static AbstractCustomer getCustomer(String name){
        for(int i=0; i<names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
