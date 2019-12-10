package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;
import prototype.prototype.MessageBox;
import prototype.prototype.UnderlinePen;

public class PrototypeMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("underline",new UnderlinePen('_'));
        manager.register("strong",new MessageBox('*'));

        Product underline = manager.create("underline");
        underline.user("HelloWorld");

        Product strong = manager.create("strong");
        strong.user("ILOVEYOU");


    }
}
