package com.ziv.decorator.c;

import com.ziv.decorator.i.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("画个小方块");
    }
}
