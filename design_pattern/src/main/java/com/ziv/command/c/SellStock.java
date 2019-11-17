package com.ziv.command.c;

import com.ziv.command.i.Order;

public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void exexute() {
        abcStock.sell();
    }
}
