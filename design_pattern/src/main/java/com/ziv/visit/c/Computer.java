package com.ziv.visit.c;

import com.ziv.visit.i.ComputerPart;
import com.ziv.visit.i.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer (){
        parts = new ComputerPart[]{new KeyBoard(),new Monitor(),new Mouse()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0;i<parts.length;i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
