package com.playground.main.learning.designpatterns.creational.singleton;

public class StaticBlockForExceptionHandling {
    private static StaticBlockForExceptionHandling instance = null;

    private StaticBlockForExceptionHandling() {
    }

    static {
        try {
            instance = new StaticBlockForExceptionHandling();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static StaticBlockForExceptionHandling getInstance() {
        return instance;
    }
}
