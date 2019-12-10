package prototype.framework;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 写好了之后就不需要动了
 */
public class Manager {
    private HashMap<String,Object> showcase = new HashMap<String, Object>(16);

    // 向管理层注册  每多需要一个类就要多注册一个
    public void register(String name,Product product){
        showcase.put(name,product);
    }

    // 创建的时候直接从map中拿  然后调用接口的createClone方法 而真正的实现是子类  可以深克隆 可以浅克隆
    public Product create(String name){
        Product p = (Product) showcase.get(name);
        return p.createClone();
    }



}
