package FactoryDesignPatterMarch.UIComponents.Button;


public class IOSButton implements button {

    @Override
    public void click() {
        System.out.println("iOS Button Clicked");
    }
}
