package com.ziv.decorator.a;

import com.ziv.decorator.i.Shape;

/**
 * 实现了接口的装饰器抽象类
 */
public  abstract class ShapeDecorator  implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator (Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

}
