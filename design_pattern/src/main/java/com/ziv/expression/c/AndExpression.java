package com.ziv.expression.c;

import com.ziv.expression.i.Expression;

public class AndExpression implements Expression {

    private Expression expr1 = null;

    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
