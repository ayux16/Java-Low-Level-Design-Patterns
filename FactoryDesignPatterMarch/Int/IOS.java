package FactoryDesignPatterMarch.Int;

import FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY.IOSUiComponentFactory;
import FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY.UIComponents;

public class IOS extends Platform{
    @Override
    public UIComponents createUIComponents() {
        return new IOSUiComponentFactory();
    }
}
