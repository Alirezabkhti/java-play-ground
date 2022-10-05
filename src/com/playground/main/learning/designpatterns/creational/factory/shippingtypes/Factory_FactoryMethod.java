package com.playground.main.learning.designpatterns.creational.factory.shippingtypes;

public class Factory_FactoryMethod {
    public static ShippingVehicle initializeShippingVehicle(ShippingVehicleType shippingVehicleType){
        switch (shippingVehicleType) {
            case TRUCK:
                return new Truck();
            default:
                return new Car();
        }
    }
}
