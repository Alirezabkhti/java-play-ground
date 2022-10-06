package com.playground.main.learning.designpatterns.structural.decorator.car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("A BasicCar created!");
    }
}
