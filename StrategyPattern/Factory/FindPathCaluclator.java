package StrategyPattern.Factory;

import StrategyPattern.Component.BikePathCalulcator;
import StrategyPattern.Component.CarPathCalculator;
import StrategyPattern.Component.PathCalculator;
import StrategyPattern.Component.WalkPathCalulcator;

public class FindPathCaluclator {
    public static PathCalculator getPathCalator(String Mode) {
        if(Mode.equals("Car")){
            return new CarPathCalculator();
        }
        else if(Mode.equals("Walk")){
            return new WalkPathCalulcator();
        }
        else if(Mode.equals("Bike")){
            return new BikePathCalulcator();
        }
        return null;
    }
}
