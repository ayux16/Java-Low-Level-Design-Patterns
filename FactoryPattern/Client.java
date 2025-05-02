package FactoryPattern;

import FactoryPattern.Component.Button;
import FactoryPattern.Component.Menu;
import FactoryPattern.Factory.AndroidComponent;
import FactoryPattern.Factory.IosComponent;
import FactoryPattern.Factory.UIComponent;
import FactoryPattern.Factory.UIComponentFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the component: ");
        String Platform=sc.nextLine();

        UIComponent component = null;
        if(Platform.equals("Android")){
            component = new AndroidComponent();
        }
        else if(Platform.equals("IOS")){
            component = new IosComponent();
        }

        UIComponentFactory uiComponentFactory=component.getUIComponentFactory();

        Button button=uiComponentFactory.createButton();
        button.ButtonPress();
        Menu menu=uiComponentFactory.createMenu();
        menu.createMenu();
    }
}
