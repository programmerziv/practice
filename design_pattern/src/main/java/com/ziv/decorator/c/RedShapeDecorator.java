package com.ziv.decorator.c;

import com.ziv.decorator.a.ShapeDecorator;
import com.ziv.decorator.i.Shape;

/**
 * 具体装饰类
 */
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        // 装饰方法
        setRedBroder(decoratedShape);
    }

    /**
     * 装饰方法
     * @param redBroder
     */
    private void setRedBroder(Shape redBroder) {
        System.out.println("shape will be print red !");
    }
}
