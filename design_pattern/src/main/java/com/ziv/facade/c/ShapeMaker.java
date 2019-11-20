package com.ziv.facade.c;


public class ShapeMaker {

    private CircleShape circle;

    private RectangleShape  rectangle;

    private SquareShape square;

    // 这种构造不推荐
    public ShapeMaker(CircleShape circle, RectangleShape rectangle, SquareShape square) {
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }


    // 这种直接在构造里new对象，隐藏了实现的细节，比较好
    public ShapeMaker() {
        this.circle = new CircleShape();

        this.rectangle = new RectangleShape();

        this.square = new SquareShape();

    }

    public void drawCicle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
