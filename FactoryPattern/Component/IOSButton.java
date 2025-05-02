package FactoryPattern.Component;

public class IOSButton implements Button {
    @Override
    public void ButtonPress() {
        System.out.println("IOS Button pressed");
    }
}
