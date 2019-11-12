package com.ziv.decorator.c;

import com.ziv.decorator.i.Shape;

public class Circle implements Shape {
    public void draw() {
        System.out.println("画个小圆圈");
    }
}
