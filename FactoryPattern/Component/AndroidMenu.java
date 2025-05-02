package FactoryPattern.Component;

public class AndroidMenu implements Menu {

    @Override
    public void createMenu() {
        System.out.println("Android Menu");
    }
}
