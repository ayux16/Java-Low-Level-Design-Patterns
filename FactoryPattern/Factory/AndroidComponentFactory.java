package FactoryPattern.Factory;

import FactoryPattern.Component.AndroidButton;
import FactoryPattern.Component.AndroidMenu;
import FactoryPattern.Component.Button;
import FactoryPattern.Component.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
