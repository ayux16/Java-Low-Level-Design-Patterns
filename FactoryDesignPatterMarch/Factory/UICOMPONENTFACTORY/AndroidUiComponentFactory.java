package FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY;

import FactoryDesignPatterMarch.UIComponents.Button.AndroidButton;
import FactoryDesignPatterMarch.UIComponents.Button.button;
import FactoryDesignPatterMarch.UIComponents.Dropdown.AndroidDropdown;
import FactoryDesignPatterMarch.UIComponents.Dropdown.DropDown;
import FactoryDesignPatterMarch.UIComponents.Menu.AndroidMenu;
import FactoryDesignPatterMarch.UIComponents.Menu.Menu;

public class AndroidUiComponentFactory implements UIComponents{
    @Override
    public button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }
}
