package com.playground.main.learning.reactivedesignpatterns.monitorobject;

import java.util.LinkedList;

/**
 * Generally, Monitor Object is a pattern that controls the concurrent access of a method in an object.
 * If there are some concurrent threads calling a method at the same time, only one thread can execute this method.
 * Compared with Active Object, Monitor Object does not have its own thread of control.
 * Here are some important concepts in Monitor Object pattern:
 * Scoped lock
 * Scoped lock is used to protect a critical section.
 * Condition variables
 * A condition variable is used to suspend a thread.
 * Once a condition is satisfied, threads waiting on this condition are awoken.
 * Java has built-in support of concurrency. Every object in Java has an intrinsic lock, with synchronized keyword we can easily protect a critical section.
 * We can also implement condition variables using wait/notify methods.
 */
public class MonitorObject {
    private LinkedList<Integer> queue = new LinkedList<>();

    public synchronized void append(int num) {
        queue.addLast(num);
        notifyAll();
    }

    public synchronized int poll() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }
        return queue.removeFirst();
    }
}
