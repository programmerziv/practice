package com.ziv.prototype;

import com.ziv.prototype.a.Shape;
import com.ziv.prototype.c.Address;
import com.ziv.prototype.c.Persion;
import com.ziv.prototype.c.ShapeCache;

import java.util.concurrent.ThreadFactory;

/**
 * <p>title:ProtoTypeDemoMain </p>
 * <p>package: com.ziv.prototype</p>
 * <p>description:原型模式main方法 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 9:05
 */
public class ProtoTypeDemoMain {

    public static void main(String[] args) throws CloneNotSupportedException {

//        ShapeCache.loadCache();
//
//        Shape shape1 = ShapeCache.getShape("1");
//        System.out.println("Shape:" + shape1.getType());
//
//        Shape shape2 = ShapeCache.getShape("2");
//        System.out.println("Shape:" + shape2.getType());
//
//        Shape shape3 = ShapeCache.getShape("3");
//        System.out.println("Shape:" + shape3.getType());


        Persion persion1 = new Persion();
        persion1.setName("阿珍");
        Address address1 = new Address();
        address1.setCity("苏州");
        persion1.setAddress(address1);


        Persion persion2 = (Persion) persion1.clone();

        System.out.println(persion1.getName() + persion1.getAddress().getCity());

        persion2.setName("阿强");
        persion2.getAddress().setCity("上海");
        System.out.println(persion2.getName() + persion2.getAddress().getCity());


        Thread thread = new Thread();



    }
}
