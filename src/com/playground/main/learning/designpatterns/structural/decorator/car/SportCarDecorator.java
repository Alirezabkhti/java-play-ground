package com.playground.main.learning.designpatterns.structural.decorator.car;

public class SportCarDecorator extends CarDecorator {

    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Cas is decorated as SportCar!");
    }
}
