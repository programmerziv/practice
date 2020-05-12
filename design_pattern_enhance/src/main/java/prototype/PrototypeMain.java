package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;
import prototype.prototype.MessageBox;
import prototype.prototype.MiddlelinePen;
import prototype.prototype.UnderlinePen;

public class PrototypeMain {

    public static void main(String[] args) {
        // 先期还是要new 具体的方法
        Manager manager = new Manager();
        manager.register("underline",new UnderlinePen('_'));
        manager.register("strong",new MessageBox('*'));
        manager.register("middle",new MiddlelinePen('-'));

        // 后期就不需要new了
        Product underline = manager.create("underline");
        underline.user("HelloWorld");

        Product strong = manager.create("strong");
        strong.user("ILOVEYOU");

        Product middle = manager.create("middle");
        middle.user("IHATEYOU");
    }
}
