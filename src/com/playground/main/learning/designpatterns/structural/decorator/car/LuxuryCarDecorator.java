package com.playground.main.learning.designpatterns.structural.decorator.car;

public class LuxuryCarDecorator extends CarDecorator {

    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Car is decorated as LuxuryCar!");
    }
}
