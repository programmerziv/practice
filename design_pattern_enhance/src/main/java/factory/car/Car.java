package factory.car;

import factory.framwork.Product;

public class Car extends Product {

    private String carName;

    public Car (String carName){
        System.out.println("创建了： " + carName);
        this.carName = carName;
    }

    public void use() {
        System.out.println("开上了：" + carName);
    }

    public String getCarName(){
        return carName;
    }
}
