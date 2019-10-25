package com.ziv.factory.c;

import com.ziv.factory.i.Shape;

/**
 * <p>title:ShapeFactory </p>
 * <p>package: com.ziv.factory</p>
 * <p>description:图形工厂 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/24 9:03
 */
public class ShapeFactory {

    public Shape getShape(String shape){
        if (shape == null){
            return null;
        }else if("circle".equals(shape)){
            return new CircleShape();
        }else if ("square".equals(shape)){
            return new SquareShape();
        }else if ("rectangle".equals(shape)){
            return new RectangleShape();
        }else {
            return null;
        }
    }
}
