package factory.idcard;

import factory.framwork.Product;

public class IDCard extends Product {

    private String owner;

    IDCard(String owner){
        System.out.println("创建了 "+owner+" IDCard");
        this.owner = owner;
    }

    public void use() {

        System.out.println("使用了 "+owner+" IDCard");
    }

    public String getOwner(){
        return owner;
    }
}
