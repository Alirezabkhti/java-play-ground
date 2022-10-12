package com.playground.main.learning.designpatterns.behavioral.interpreter;

import com.playground.main.learning.designpatterns.behavioral.interpreter.expression.Expression;
import com.playground.main.learning.designpatterns.behavioral.interpreter.expression.TerminalExpression;
import com.playground.main.learning.designpatterns.behavioral.interpreter.expression.subexpression.AndExpression;
import com.playground.main.learning.designpatterns.behavioral.interpreter.expression.subexpression.OrExpression;

public class Main {
    public static void main(String[] args) {
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);
        System.out.println(isSingle.interpreter("Kushagra"));
        System.out.println(isSingle.interpreter("Lokesh"));
        System.out.println(isSingle.interpreter("Achint"));

        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);
        System.out.println(isCommitted.interpreter("Committed, Vikram"));
        System.out.println(isCommitted.interpreter("Single, Vikram"));

    }
}
