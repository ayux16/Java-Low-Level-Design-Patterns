package FactoryDesignPatterMarch.Factory.PlatformSimpleFactory;

import FactoryDesignPatterMarch.Int.Android;
import FactoryDesignPatterMarch.Int.IOS;
import FactoryDesignPatterMarch.Int.Platform;

public class PlatformFactory {
    public static Platform getPlatformByName(String Pf) {
        Platform platform = null;
        if (Pf.equals("Android")) {
            platform = new Android();
        } else if (Pf.equals("IOS")) {
            platform = new IOS();
        }
        return platform;
    }
}
