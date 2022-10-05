package com.playground.main.learning.designpatterns.creational.abstractfactory.guiabstractfactory;

import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.buttton.Button;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.buttton.WindowsButton;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.checkbox.Checkbox;
import com.playground.main.learning.designpatterns.creational.abstractfactory.gui.checkbox.WindowsCheckBox;

public class WindowsGUIFactory extends GUIAbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}
