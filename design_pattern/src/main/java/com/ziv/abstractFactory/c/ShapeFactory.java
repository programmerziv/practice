package com.ziv.abstractFactory.c;

import com.ziv.abstractFactory.a.AbstractFactory;
import com.ziv.abstractFactory.i.Colour;
import com.ziv.abstractFactory.i.Shape;

/**
 * <p>title:ShapeFactory</p>
 * <p>package: com.ziv.abstractFactory</p>
 * <p>description:图形类工厂，只实现图形类 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 9:20
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Colour getColour(String colour) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape.equals("circle")){
            return new CircleShape();
        }else if (shape.equals("square")){
            return new SquareShape();
        }else if (shape.equals("rectangle")){
            return new RectangleShape();
        }
        return null;
    }
}
