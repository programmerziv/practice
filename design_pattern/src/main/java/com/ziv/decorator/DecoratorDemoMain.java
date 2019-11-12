package com.ziv.decorator;

import com.ziv.decorator.a.ShapeDecorator;
import com.ziv.decorator.c.Circle;
import com.ziv.decorator.c.RedShapeDecorator;
import com.ziv.decorator.i.Shape;

public class DecoratorDemoMain {
    public static void main(String[] args) {

        Shape circle = new Circle();

        ShapeDecorator redCircle = new RedShapeDecorator(circle);

        circle.draw();
        System.out.println("===================");
        // 必须要装饰类的方法才能实现装饰
        redCircle.draw();
    }
}
