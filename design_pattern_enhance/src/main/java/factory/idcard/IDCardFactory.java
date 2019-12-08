package factory.idcard;

import factory.framwork.Factory;
import factory.framwork.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<String>(16);


    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners(){
        return this.owners;
    }
}
