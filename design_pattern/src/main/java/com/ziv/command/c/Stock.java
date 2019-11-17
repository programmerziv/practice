package com.ziv.command.c;

/**
 * 作为请求的stock类
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("buy "+ name + "," + quantity +"个");
    }

    public void sell(){
        System.out.println("sell " + name +"," + quantity + "个");
    }
}
