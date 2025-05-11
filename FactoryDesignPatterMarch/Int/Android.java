package FactoryDesignPatterMarch.Int;

import FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY.AndroidUiComponentFactory;
import FactoryDesignPatterMarch.Factory.UICOMPONENTFACTORY.UIComponents;

public class Android extends Platform{

    @Override
    public UIComponents createUIComponents() {
        return new AndroidUiComponentFactory();
    }
}
