package com.ziv.visit.c;

import com.ziv.visit.i.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(KeyBoard keyBoard) {
        System.out.println("Display KeyBoard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Display Monitor");
    }

    public void visit(Mouse mouse) {
        System.out.println("Display Mouse");
    }

    public void visit(Computer computer) {
        System.out.println("Display Computer");
    }
}
