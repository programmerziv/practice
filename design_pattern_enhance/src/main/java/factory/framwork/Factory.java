package factory.framwork;

public abstract class Factory {

    /**
     * 工厂中有模板
     * @param owner
     * @return
     */
    public final  Product create(String owner){
        Product product = createProduct(owner);

        registerProduct(product);

        return product;

    }
   public abstract Product createProduct(String owner);

   public abstract void registerProduct(Product product);
}
