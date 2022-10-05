package com.playground.main.learning.designpatterns.structural.adapter;

public class CarAdaptee implements MovableAdaptee{
    @Override
    public double getSpeed() {
        return 100.0D;
    }
}
