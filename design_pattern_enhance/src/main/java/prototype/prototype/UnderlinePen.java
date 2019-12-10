package prototype.prototype;

import prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen (char ulchar){
        this.ulchar = ulchar;
    }

    public void user(String s) {
        System.out.println(ulchar +" " + s +" " + ulchar);
    }
    // 浅克隆
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
