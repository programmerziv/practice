package com.ziv.prototype.c;

import com.ziv.prototype.a.Shape;

/**
 * <p>title:CircleShape </p>
 * <p>package: com.ziv.prototype</p>
 * <p>description:圆形 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 8:47
 */
public class CircleShape extends Shape {

    @Override
    public void draw() {
        System.out.println("画个圆圈！！");
    }

    public CircleShape() {
        type = "Circle";
    }
}
