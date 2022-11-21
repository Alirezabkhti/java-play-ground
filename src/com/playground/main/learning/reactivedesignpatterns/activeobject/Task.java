package com.playground.main.learning.reactivedesignpatterns.activeobject;

public class Task implements Comparable<Task> {
    int priority;
    String name;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
