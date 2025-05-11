package FactoryDesignPatterMarch;

import FactoryDesignPatterMarch.Factory.PlatformSimpleFactory.PlatformFactory;
import FactoryDesignPatterMarch.Int.Android;
import FactoryDesignPatterMarch.Int.IOS;
import FactoryDesignPatterMarch.Int.Platform;
import FactoryDesignPatterMarch.UIComponents.Button.button;
import FactoryDesignPatterMarch.UIComponents.Dropdown.DropDown;
import FactoryDesignPatterMarch.UIComponents.Menu.Menu;

import java.awt.*;
import java.util.Scanner;


public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String Pf = scanner.nextLine();
        Platform platform = PlatformFactory.getPlatformByName(Pf);
        /*
        Platform platform = null;
        if(Pf.equals("Android")){
            platform = new Android();
        }
        else if(Pf.equals("IOS")){
            platform = new IOS();
        }


        In this case the object of platform is dependent uppon a string passed by user;
        so push it into a simple factory
         */
            button button = platform.createUIComponents().createButton();
            Menu menu = platform.createUIComponents().createMenu();
            DropDown dropDown=platform.createUIComponents().createDropDown();
            button.click();
            menu.createMenu();
            dropDown.createDropDown();
    }
}
/*
Button button=null;

        if(platform instanceof Android){
            System.out.println("Android platform selected");
            button =new AndroidButton();

        } else {
            System.out.println("Other platform selected");
        }
as of now we know button is completely responsble on platform
so why not give the responsibility to platform itself to create the button
*/