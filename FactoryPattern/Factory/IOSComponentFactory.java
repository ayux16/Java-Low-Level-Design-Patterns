package FactoryPattern.Factory;

import FactoryPattern.Component.Button;
import FactoryPattern.Component.IOSButton;
import FactoryPattern.Component.IOSmenu;
import FactoryPattern.Component.Menu;

public class IOSComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSmenu();
    }
}
