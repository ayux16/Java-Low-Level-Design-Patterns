package StrategyDesignPatternMarch.StrategyPattern;

public class MergeSort implements Sorter{
    @Override
    public int[] sorter(int[] arr) {
        System.out.println("Merge Sort");
        return new int[]{6,5,4,3,2,1};
    }
}
