package factory;

import factory.framwork.Factory;
import factory.framwork.Product;
import factory.idcard.IDCardFactory;

public class IDCardFactoryMain {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product product1 = factory.create("张三");
        product1.use();
        Product product2 = factory.create("李四");
        product2.use();


    }
}
