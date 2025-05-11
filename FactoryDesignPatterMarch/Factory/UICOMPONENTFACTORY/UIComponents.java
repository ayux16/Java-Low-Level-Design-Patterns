package FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY;

import FactoryDesignPatterMarch.UIComponents.Button.button;
import FactoryDesignPatterMarch.UIComponents.Dropdown.DropDown;
import FactoryDesignPatterMarch.UIComponents.Menu.Menu;

public interface UIComponents {
    abstract button createButton();
    abstract Menu createMenu();
    abstract DropDown createDropDown();
}
