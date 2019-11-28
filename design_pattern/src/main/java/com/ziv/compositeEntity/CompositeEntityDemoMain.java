package com.ziv.compositeEntity;

public class CompositeEntityDemoMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("First data","data1");
        client.printData();
        System.out.println("============================");
        client.setData("Second data","data2");
        client.printData();
    }

}
