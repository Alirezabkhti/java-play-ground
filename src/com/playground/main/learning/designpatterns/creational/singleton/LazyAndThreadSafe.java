package com.playground.main.learning.designpatterns.creational.singleton;

public class LazyAndThreadSafe {

    private static LazyAndThreadSafe instance = null;

    private LazyAndThreadSafe() {
    }

    public static LazyAndThreadSafe getInstance() {
        if (instance == null)
            synchronized (LazyAndThreadSafe.class) {
                if (instance == null) {
                    instance = new LazyAndThreadSafe();
                }
            }
        return instance;
    }
}
