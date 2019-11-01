package com.ziv.bridge.c;

import com.ziv.bridge.a.Shape;
import com.ziv.bridge.i.DrawAPI;

/**
 * <p>title: </p>
 * <p>package: com.ziv.bridge</p>
 * <p>description: </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/31 8:46
 */
public class CircleShape extends Shape {

    private int radius,x,y;

    public CircleShape(int radius, int x, int y, DrawAPI drawAPI){
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;


    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
