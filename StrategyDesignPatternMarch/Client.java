package StrategyDesignPatternMarch;

import StrategyDesignPatternMarch.SimpleFactory.SelectSorting;
import StrategyDesignPatternMarch.StrategyPattern.HeapSort;
import StrategyDesignPatternMarch.StrategyPattern.MergeSort;

import java.util.Scanner;

public class Client {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String select=sc.nextLine();
        SelectSorting selectSorting=new SelectSorting();
        if(select.equals("merge")){
            selectSorting.selectSortingStrategy(new MergeSort());
        }
        else{
            selectSorting.selectSortingStrategy(new HeapSort());
        }
        int ans[]=selectSorting.execute(new int[]{1,6});
        for(int i:ans){
            System.out.println(i);
        }
    }
}
