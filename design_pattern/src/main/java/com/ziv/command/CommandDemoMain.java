package com.ziv.command;

import com.ziv.command.c.Broker;
import com.ziv.command.c.BuyStock;
import com.ziv.command.c.SellStock;
import com.ziv.command.c.Stock;
import com.ziv.command.i.Order;

public class CommandDemoMain {

    public static void main(String[] args) {
        Order sellOrder = new SellStock(new Stock());

        Order buyOrder = new BuyStock(new Stock());

        Broker broker = new Broker();

        broker.takeOrder(sellOrder);
        broker.takeOrder(buyOrder);

        broker.palceOrders();
    }
}
