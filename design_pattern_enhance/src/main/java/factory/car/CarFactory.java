package factory.car;

import factory.framwork.Factory;
import factory.framwork.Product;

import java.util.ArrayList;
import java.util.List;

public class CarFactory extends Factory {

    private List<String> carNames = new ArrayList<String>(16);


    public Product createProduct(String carName) {
        Product car = new Car(carName);
        System.out.println("工厂创建了："+carName );
        return car;
    }

    public void registerProduct(Product product) {
        carNames.add(((Car)product).getCarName());
        System.out.println("登记了"+((Car) product).getCarName());
    }
    public List<String> getCarNames(){
        return carNames;
    }
}
