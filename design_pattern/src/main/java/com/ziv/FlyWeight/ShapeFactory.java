package com.ziv.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    // 主要利用了hashMap来装取已经创建好的数据
    public static final Map<String,Circle> circleMap = new HashMap<String, Circle>(16);

    public static Shape getShape(String colour){
        // map里没有要创建 有的直接返回
        if(circleMap.get(colour) == null){
            Circle circle = new Circle();
            circle.setColour(colour);
            circleMap.put(colour,circle);
            System.out.println("create a circle of colour "+ colour );
            System.out.println("_________________________-");
        }
        return (Circle)circleMap.get(colour);
    }

}
