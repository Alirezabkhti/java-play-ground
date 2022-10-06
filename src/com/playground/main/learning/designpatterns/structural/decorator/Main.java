package com.playground.main.learning.designpatterns.structural.decorator;

import com.playground.main.learning.designpatterns.structural.decorator.car.BasicCar;
import com.playground.main.learning.designpatterns.structural.decorator.car.Car;
import com.playground.main.learning.designpatterns.structural.decorator.car.LuxuryCarDecorator;
import com.playground.main.learning.designpatterns.structural.decorator.car.SportCarDecorator;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportCarDecorator(new BasicCar());
        sportsCar.assemble();
        System.out.println("-------------------------");
        Car sportsLuxuryCar = new SportCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
