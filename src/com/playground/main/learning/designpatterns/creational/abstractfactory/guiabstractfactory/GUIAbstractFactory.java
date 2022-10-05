package com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory;

import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.buttton.Button;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.checkbox.Checkbox;

public abstract class GUIAbstractFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
