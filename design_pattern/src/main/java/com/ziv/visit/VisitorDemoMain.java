package com.ziv.visit;

import com.ziv.visit.c.Computer;
import com.ziv.visit.c.ComputerPartDisplayVisitor;

public class VisitorDemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
