package FactoryPattern.Factory;

import FactoryPattern.Component.Button;
import FactoryPattern.Component.Menu;

public interface UIComponentFactory {
    Button createButton();
    Menu createMenu();
}
