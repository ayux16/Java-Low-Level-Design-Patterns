package FactoryPattern.Component;

public class AndroidButton implements Button {
    @Override
    public void ButtonPress() {
        System.out.println("Android Button pressed");
    }
}
