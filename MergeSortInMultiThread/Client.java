package MergeSortInMultiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<Integer> list = List.of(9,4,2,1,10,8,5,3,7,6);
        ExecutorService executor = Executors.newCachedThreadPool();

        mergeSort mergeSort = new mergeSort(list);
        Future<List<Integer>> sortedList = executor.submit(mergeSort);
        List<Integer>sorted=sortedList.get();
        System.out.println(sorted);
    }
}
