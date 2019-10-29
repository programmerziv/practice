package com.ziv.prototype;

import com.ziv.prototype.a.Shape;
import com.ziv.prototype.c.ShapeCache;

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

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("Shape:" + shape1.getType());

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape:" + shape2.getType());

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("Shape:" + shape3.getType());


    }
}
