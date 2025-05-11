package FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY;

import FactoryDesignPatterMarch.UIComponents.Button.IOSButton;
import FactoryDesignPatterMarch.UIComponents.Button.button;
import FactoryDesignPatterMarch.UIComponents.Dropdown.DropDown;
import FactoryDesignPatterMarch.UIComponents.Dropdown.IOSDropdown;
import FactoryDesignPatterMarch.UIComponents.Menu.IOSMenu;
import FactoryDesignPatterMarch.UIComponents.Menu.Menu;

public class IOSUiComponentFactory implements UIComponents{
    @Override
    public button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }
}
