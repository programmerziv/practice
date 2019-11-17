package com.ziv.command.c;

import com.ziv.command.i.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用对象的类
 */
public class Broker {

    List<Order> orders = new ArrayList<Order>(10);

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void palceOrders(){
        for(Order order:orders){
            order.exexute();
        }
    }
}
