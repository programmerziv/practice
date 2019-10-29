package com.ziv.prototype.c;

import com.ziv.prototype.a.Shape;

/**
 * <p>title: SquareShape</p>
 * <p>package: com.ziv.prototype</p>
 * <p>description:方块 </p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 8:47
 */
public class SquareShape extends Shape {

    @Override
    public void draw() {
        System.out.println("画个方块！！");
    }

    public SquareShape() {
        type = "Square";
    }
}
