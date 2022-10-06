package com.playground.main.learning.designpatterns.structural.flyweight;

import com.playground.main.learning.designpatterns.structural.flyweight.gazillion.FlyweightFactory;

public class Main {

    public static final int ROWS = 6;
    public static final int COLS = 10;

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory(ROWS);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++)
                flyweightFactory.getFlyweight(i).report(j);
            System.out.println();
        }
    }
}
