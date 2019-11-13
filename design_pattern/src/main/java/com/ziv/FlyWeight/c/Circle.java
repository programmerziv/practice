package com.ziv.FlyWeight.c;

import com.ziv.FlyWeight.i.Shape;

public class Circle implements Shape {

    private int x;

    private int y;

    private int radius;

    private String colour;

    public void draw() {
        System.out.println("draw a "+ colour +" circle");
        System.out.println("x:"+x+",y:"+y+",radious:"+radius);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

    public Circle() {
    }

    public Circle(int x, int y, int radius, String colour) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
