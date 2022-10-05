package com.playground.main.learning.designpatterns.creational.factory.shippingtypes;

class Truck implements ShippingVehicle{
    @Override
    public void ship() {
        System.out.println("You chose Truck as shipping vehicle!");
    }
}
