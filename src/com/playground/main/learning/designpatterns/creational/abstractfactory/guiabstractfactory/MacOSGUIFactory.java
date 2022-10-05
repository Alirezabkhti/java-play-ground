package com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory;

import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.buttton.Button;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.buttton.MacOSButton;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.checkbox.Checkbox;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.checkbox.MacOSCheckBox;

public class MacOSGUIFactory extends GUIAbstractFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckBox();
    }
}
