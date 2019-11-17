package com.ziv.expression;

import com.ziv.expression.c.AndExpression;
import com.ziv.expression.c.OrExpression;
import com.ziv.expression.c.TerminalExpression;
import com.ziv.expression.i.Expression;

public class ExpressionDemoMain {

    /**
     * 规则：robert和john是男性
     * @return
     */
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }

    /**
     * 规则：Julie是一个已婚女性
     * @return
     */
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male ? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman ? " + isMarriedWoman.interpret("no Julie"));

    }
}
