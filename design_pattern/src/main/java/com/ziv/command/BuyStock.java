package com.ziv.command;

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock (Stock abcStock){
        this.abcStock = abcStock;
    }

    public void exexute() {
        abcStock.buy();
    }
}
