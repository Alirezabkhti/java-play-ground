package com.playground.main.learning.designpatterns.creational.singleton;

public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
