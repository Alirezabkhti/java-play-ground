package com.playground.main.learning.designpatterns.structural.memento;

/**
 * Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.
 * A magic cookie that encapsulates a "check point" capability.
 * Promote undo or rollback to full object status.
 */
public class Main {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento(originator.save());
        originator.setState("State3");
        originator.setState("State4");
        originator.restore(caretaker.getMemento());
    }
}
