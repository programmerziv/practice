package com.ziv.factory;

/**
 * <p>title: ShapeFactory2</p>
 * <p>package: com.ziv.factory</p>
 * <p>description: 利用枚举的2号工厂</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/25 8:39
 */
public class ShapeFactory2 {

    public static Shape getShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return new CircleShape();
            case SQUARE:
                return new SquareShape();
            case RECTANGLE:
                return new RectangleShape();
            default:
                return null;
        }
    }
}
