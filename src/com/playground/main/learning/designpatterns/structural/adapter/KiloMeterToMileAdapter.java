package com.playground.main.learning.designpatterns.structural.adapter;

public class KiloMeterToMileAdapter implements MovableAdapter {
    private MovableAdaptee movableAdaptee;

    public KiloMeterToMileAdapter(MovableAdaptee movableAdaptee) {
        this.movableAdaptee = movableAdaptee;
    }


    @Override
    public double convertKMToMile() {
        return movableAdaptee.getSpeed() * 1.5;
    }
}
