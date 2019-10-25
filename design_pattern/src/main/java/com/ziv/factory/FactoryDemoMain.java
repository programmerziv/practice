package com.ziv.factory;

/**
 * <p>title:FactoryDemoMain </p>
 * <p>package: com.ziv.factory</p>
 * <p>description:factory main方法 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/24 9:08
 */
public class FactoryDemoMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle1 = shapeFactory.getShape("circle");
        circle1.draw();

        Shape square1 = shapeFactory.getShape("square");
        square1.draw();

        Shape rectangle1 = shapeFactory.getShape("rectangle");
        rectangle1.draw();

        System.out.println("---------------------------------------");

        Shape circle2 = ShapeFactory2.getShape(ShapeType.CIRCLE);
        circle2.draw();

        Shape square2 = ShapeFactory2.getShape(ShapeType.SQUARE);
        square2.draw();

        Shape rectangle2 = ShapeFactory2.getShape(ShapeType.RECTANGLE);
        rectangle2.draw();

    }
}
