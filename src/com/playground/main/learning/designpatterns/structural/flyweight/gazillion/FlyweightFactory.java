package com.playground.main.learning.designpatterns.structural.flyweight.gazillion;

/**
 * Use sharing to support large numbers of fine-grained objects efficiently.
 * The Motif GUI strategy of replacing heavy-weight widgets with light-weight gadgets.
 */
public class FlyweightFactory {
    private Gazillion[] pool;

    public FlyweightFactory(int maxRows) {
        pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}
