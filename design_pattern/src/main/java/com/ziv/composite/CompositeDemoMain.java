package com.ziv.composite;

public class CompositeDemoMain {

    public static void main(String[] args) {
        Employee CEO = new Employee("Ziv","CEO","200000000");

        Employee headSale = new Employee("Tom","Head Sales","2000000");

        Employee headMarking = new Employee("Jack","Head Marking","2000000");

        Employee clerk1 = new Employee("Clerk1","Marking","200000");
        Employee clerk2 = new Employee("Clerk2","Marking","200000");

        Employee saleExecutive1 = new Employee("Sale1","Sales","100000");
        Employee saleExecutive2 = new Employee("Sale2","Sales","100000");

        CEO.add(headSale);
        CEO.add(headMarking);

        headSale.add(saleExecutive1);
        headSale.add(saleExecutive2);

        headMarking.add(clerk1);
        headMarking.add(clerk2);

        System.out.println(CEO);




    }
}
