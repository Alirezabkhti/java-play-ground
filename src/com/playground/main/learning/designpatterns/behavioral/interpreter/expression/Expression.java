package com.playground.main.learning.designpatterns.behavioral.interpreter.expression;

public abstract class Expression {
    protected String dataToInterpret;

    public abstract boolean interpreter(String context);
}
