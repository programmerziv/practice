package com.ziv.nil;

import com.ziv.nil.a.AbstractCustomer;
import com.ziv.nil.c.CustomerFactory;

public class NullDemoMain {

    public static void main(String[] args) {

        // 通过参数传递定义好的值，来取得返回对象，有则返回有值，没有也不会报空指针
        AbstractCustomer customer1 = CustomerFactory.getCustomer("张三");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("李四");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("王五");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("王八蛋");


        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
