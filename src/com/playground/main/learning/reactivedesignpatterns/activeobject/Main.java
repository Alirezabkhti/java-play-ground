package com.playground.main.learning.reactivedesignpatterns.activeobject;

/**
 * Active Object is a concurrency pattern in which we try to separate the invocation of a method from its execution.
 * Typically, an active object provides synchronous methods and executes the method calls in an asynchronous way.
 * An active object usually has its own thread of control.
 * This pattern is useful in refactoring legacy projects by introducing concurrency capability.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ActiveObject obj = new ActiveObject();
        obj.doTask("1", 2);
        obj.doTask("2", 0);
        obj.doTask("3", 1);
    }
}
