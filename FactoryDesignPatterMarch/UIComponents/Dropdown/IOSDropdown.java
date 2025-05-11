package FactoryDesignPatterMarch.UIComponents.Dropdown;

public class IOSDropdown implements DropDown {
    @Override
    public void createDropDown() {
        System.out.println("Creating iOS style dropdown");
    }
}
