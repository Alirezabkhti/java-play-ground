package com.playground.main.learning.designpatterns.behavioral.interpreter.expression.subexpression;

import com.playground.main.learning.designpatterns.behavioral.interpreter.expression.Expression;

public class OrExpression extends Expression {
    private Expression firstExpression;
    private Expression secondExpression;

    public OrExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }


    @Override
    public boolean interpreter(String context) {
        return firstExpression.interpreter(context) || secondExpression.interpreter(context);
    }
}
