package com.ziv.prototype.c;

import com.ziv.prototype.a.Shape;

/**
 * <p>title: RectangleShape</p>
 * <p>package: com.ziv.prototype</p>
 * <p>description:矩形 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 8:47
 */
public class RectangleShape extends Shape {

    @Override
    public void draw() {
        System.out.println("画个矩形！！");
    }

    public RectangleShape() {
        type = "rectangle";
    }
}
