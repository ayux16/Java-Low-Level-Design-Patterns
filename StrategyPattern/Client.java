package StrategyPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath("Lucknow","Delhi","Walk");
    }
}
