package com.ziv.expression.c;

import com.ziv.expression.i.Expression;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public Boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
