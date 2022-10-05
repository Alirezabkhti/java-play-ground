package com.playground.main.learning.designpatterns.creational.factory.shippingtypes;

class Car implements ShippingVehicle{
    @Override
    public void ship() {
        System.out.println("You chose Car as shipping vehicle!");
    }
}
