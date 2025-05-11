package FactoryDesignPatterMarch.Int;

import FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY.UIComponents;

public abstract class Platform {
    //some method of platform exist here itself
/*    abstract Button createButton();
    abstract Menu createMenu();
    abstract DropDown createDropDown();

Platform is saying he can do all of this but this can become owerwhelming for it
as it have its own responsibility as of now
so seperate these responsibility into another interface;
 */
    public abstract UIComponents createUIComponents();
}
