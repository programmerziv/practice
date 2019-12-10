package prototype.prototype;

import prototype.framework.Product;

public class MessageBox implements Product {
    private char msgbox;

    public MessageBox(char msgbox){
        this.msgbox = msgbox;
    }

    public void user(String s) {
        System.out.println(msgbox + " "+ s + " " + msgbox);
    }

    // 浅克隆
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
