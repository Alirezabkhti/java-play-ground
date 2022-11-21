package com.playground.main.learning.reactivedesignpatterns.activeobject;

import java.util.concurrent.PriorityBlockingQueue;

public class ActiveObject {
    private PriorityBlockingQueue<Task> dispatchQueue = new PriorityBlockingQueue<>();

    public ActiveObject() {
        new Thread(() -> {
            while (true) {
                try {
                    Task task = dispatchQueue.take();
                    System.out.println("Executing task " + task.name);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }).start();
    }

    public void doTask(String name, int priority) {
        dispatchQueue.put(new Task(name, priority));
    }
}
