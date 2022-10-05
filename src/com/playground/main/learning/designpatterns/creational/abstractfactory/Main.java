package com.playground.main.learning.designpatterns.creational.abstractfactory;

import com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory.GUIAbstractFactory;
import com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory.GUIFactory;
import com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory.GUIFactoryTypes;

public class Main {
    public static void main(String[] args) {
        GUIAbstractFactory guiAbstractFactory = GUIFactory.createGUIFactory(GUIFactoryTypes.Windows);
        guiAbstractFactory.createButton();
        guiAbstractFactory.createCheckbox();

        guiAbstractFactory = GUIFactory.createGUIFactory(GUIFactoryTypes.MacOS);
        guiAbstractFactory.createButton();
        guiAbstractFactory.createCheckbox();
    }
}
