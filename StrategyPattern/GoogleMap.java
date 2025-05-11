package StrategyPattern;

import StrategyPattern.Component.PathCalculator;
import StrategyPattern.Factory.FindPathCaluclator;

public class GoogleMap {
    public void findPath(String from, String to, String mode) {
        PathCalculator findPath=FindPathCaluclator.getPathCalator(mode);
        findPath.findPathCalculator(from, to);
    }
}
