package com.ziv.visit.c;

import com.ziv.visit.i.ComputerPart;
import com.ziv.visit.i.ComputerPartVisitor;

public class KeyBoard implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
