package com.ziv.abstractFactory;

import com.ziv.abstractFactory.a.AbstractFactory;
import com.ziv.abstractFactory.c.FactoryProduct;
import com.ziv.abstractFactory.i.Shape;

/**
 * <p>title: AbstractFactoryDemoMain</p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description: 抽象工厂具体main方法</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:31
 */
public class AbstractFactoryDemoMain {

    public static void main(String[] args) {
        // 先确定什么工厂
        AbstractFactory shape = FactoryProduct.getFactory("Shape");
        // 再确定生产什么
        Shape circle = shape.getShape("circle");
        circle.draw();

    }
}
