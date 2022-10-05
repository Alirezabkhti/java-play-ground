package com.playground.main.learning.designpatterns.creational.factory;

import com.playground.main.learning.designpatterns.creational.factory.shippingtypes.Factory_FactoryMethod;
import com.playground.main.learning.designpatterns.creational.factory.shippingtypes.ShippingVehicle;
import com.playground.main.learning.designpatterns.creational.factory.shippingtypes.ShippingVehicleType;

public class Main {
    public static void main(String[] args) {
        ShippingVehicle shippingVehicle = Factory_FactoryMethod.initializeShippingVehicle(ShippingVehicleType.CAR);
        shippingVehicle.ship();
        shippingVehicle = Factory_FactoryMethod.initializeShippingVehicle(ShippingVehicleType.TRUCK);
        shippingVehicle.ship();
    }
}
