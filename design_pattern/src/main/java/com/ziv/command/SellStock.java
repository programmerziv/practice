package com.ziv.command;

public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void exexute() {
        abcStock.sell();
    }
}
