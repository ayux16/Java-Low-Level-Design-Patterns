package StrategyDesignPatternMarch.SimpleFactory;

import StrategyDesignPatternMarch.StrategyPattern.HeapSort;
import StrategyDesignPatternMarch.StrategyPattern.MergeSort;
import StrategyDesignPatternMarch.StrategyPattern.Sorter;

public class SelectSorting {
    private Sorter sortingStrategy;
    public void selectSortingStrategy(Sorter sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }

    public int[] execute(int arr[]){
        return sortingStrategy.sorter(arr);
    }
}
