package com.ziv.command;

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
