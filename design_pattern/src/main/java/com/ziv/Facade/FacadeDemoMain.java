package com.ziv.Facade;

import com.ziv.Facade.c.CircleShape;
import com.ziv.Facade.c.RectangleShape;
import com.ziv.Facade.c.ShapeMaker;
import com.ziv.Facade.c.SquareShape;

public class FacadeDemoMain {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker(new CircleShape(),new RectangleShape(),new SquareShape());

        shapeMaker.drawCicle();

        shapeMaker.drawRectangle();

        shapeMaker.drawSquare();

        System.out.println("===============================");

        ShapeMaker shapeMaker1 = new ShapeMaker();

        shapeMaker1.drawCicle();

        shapeMaker1.drawRectangle();

        shapeMaker1.drawSquare();
    }



}
