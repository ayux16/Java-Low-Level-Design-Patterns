package MergeSortInMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class mergeSort implements Callable<List<Integer>> {
    List<Integer> mergeList;
    mergeSort(List<Integer> mergeList) {
        this.mergeList = mergeList;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(mergeList.size()<=1) return mergeList;
        int middle = mergeList.size()/2;
        List<Integer> leftList=mergeList.stream().limit(middle).collect(Collectors.toList());
        List<Integer> rightList=mergeList.stream().skip(middle).collect(Collectors.toList());
//        List<Integer> leftList=new ArrayList<>();
//        List<Integer> rightList=new ArrayList<>();
//        for(int i=0;i<middle;i++) {
//            leftList.add(mergeList.get(i));
//        }
//        for(int i=middle;i<mergeList.size();i++) {
//            rightList.add(mergeList.get(i));
//        }
        mergeSort mergeSort=new mergeSort(leftList);
        mergeSort mergeSort2=new mergeSort(rightList);
        ExecutorService executor=Executors.newCachedThreadPool();
        Future<List<Integer>> futureSortedLeftList=executor.submit(mergeSort);
        Future<List<Integer>> futureSortedRightList=executor.submit(mergeSort2);


        List<Integer> sortedLeftList=futureSortedLeftList.get();
        List<Integer>sortedRightList=futureSortedRightList.get();
        List<Integer> sortedList=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<sortedLeftList.size() && j<sortedRightList.size()){
            if(sortedLeftList.get(i)<sortedRightList.get(j)){
                sortedList.add(sortedLeftList.get(i));
                i++;
            }
            else{
                sortedList.add(sortedRightList.get(j));
                j++;
            }
        }
        while(i<sortedLeftList.size()){
            sortedList.add(sortedLeftList.get(i));
            i++;
        }
        while(j<sortedRightList.size()){
            sortedList.add(sortedRightList.get(j));
            j++;
        }
        return sortedList;
    }
}
