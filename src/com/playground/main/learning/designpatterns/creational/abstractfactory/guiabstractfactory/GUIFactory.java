package com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory;

import javax.crypto.Mac;

public class GUIFactory {
    public static GUIAbstractFactory createGUIFactory(GUIFactoryTypes guiFactoryTypes) {
        if (guiFactoryTypes == GUIFactoryTypes.MacOS)
            return new MacOSGUIFactory();
        else
            return new WindowsGUIFactory();
    }
}
