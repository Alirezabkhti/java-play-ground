package com.playground.main.learning.designpatterns.behavioral.interpreter.expression;

public class TerminalExpression extends Expression {
    public TerminalExpression(String dataToInterpret) {
        this.dataToInterpret  = dataToInterpret;
    }

    @Override
    public boolean interpreter(String context) {
        return context.contains(dataToInterpret);
    }
}
