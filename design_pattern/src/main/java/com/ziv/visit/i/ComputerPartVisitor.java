package com.ziv.visit.i;

import com.ziv.visit.c.Computer;
import com.ziv.visit.c.KeyBoard;
import com.ziv.visit.c.Monitor;
import com.ziv.visit.c.Mouse;

public interface ComputerPartVisitor {

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(Computer computer);
}
