package StrategyDesignPatternMarch.StrategyPattern;

public class HeapSort implements Sorter{
    @Override
    public int[] sorter(int[] arr) {
        System.out.println("Heap Sort");
        return new int[]{1,2,3,4,5,6};
    }
}
