package factory;

import factory.car.CarFactory;
import factory.framwork.Factory;
import factory.framwork.Product;

public class CarFactoryMain {

    public static void main(String[] args) {

        Factory factory = new CarFactory();
        Product product1 = factory.create("宝马");
        product1.use();

        Product product2 = factory.create("奥迪");
        product2.use();


    }
}
