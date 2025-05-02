package FactoryPattern.Factory;

public class AndroidComponent implements UIComponent {
    @Override
    public void refresh() {
        System.out.println("AndroidComponent refresh");
    }

    public void message(){
        System.out.println("AndroidComponent message");
    }
    @Override
    public UIComponentFactory getUIComponentFactory() {
        this.message();
        this.refresh();
        return new AndroidComponentFactory();
    }
}
