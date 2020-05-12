package prototype.prototype;

import prototype.framework.Product;

public class MiddlelinePen implements Product {

    private char middleline;

    public MiddlelinePen(char middleline){
        this.middleline = middleline;
    }

    public void user(String s) {
        System.out.println(middleline + " " + s + " " + middleline );
    }

    public Product createClone() {
        Product p = null;

        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
