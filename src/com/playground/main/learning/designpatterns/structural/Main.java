package com.playground.main.learning.designpatterns.structural;

import com.playground.main.learning.designpatterns.structural.adapter.CarAdaptee;
import com.playground.main.learning.designpatterns.structural.adapter.KiloMeterToMileAdapter;
import com.playground.main.learning.designpatterns.structural.adapter.MovableAdapter;

public class Main {
    public static void main(String[] args) {
        System.out.println(new KiloMeterToMileAdapter(new CarAdaptee()).convertKMToMile());
    }
}
