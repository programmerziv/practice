package com.ziv.visit.c;

import com.ziv.visit.i.ComputerPart;
import com.ziv.visit.i.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisit) {
        computerPartVisit.visit(this);
    }
}
