package FactoryPattern.Factory;

public class IosComponent implements UIComponent {
    @Override
    public void refresh() {
        System.out.println("IosComponent refresh");
    }
    public void message(){
        System.out.println("IosComponent message");
    }

    @Override
    public UIComponentFactory getUIComponentFactory() {
        this.refresh();
        this.message();
        return new IOSComponentFactory();
    }
}
