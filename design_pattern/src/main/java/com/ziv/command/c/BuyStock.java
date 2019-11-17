package com.ziv.command.c;

import com.ziv.command.i.Order;

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock (Stock abcStock){
        this.abcStock = abcStock;
    }

    public void exexute() {
        abcStock.buy();
    }
}
