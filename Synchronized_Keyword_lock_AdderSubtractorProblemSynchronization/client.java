package Synchronized_Keyword_lock_AdderSubtractorProblemSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class client {
    public static void main(String[] args) {
        Count count=new Count(0);
//        Lock lock=new ReentrantLock();
        adder add=new adder(count);
        subtractor sub=new subtractor(count);

        Thread t1=new Thread(add);
        Thread t2=new Thread(sub);
        t1.start();
        t2.start();
        System.out.println(count.value);

    }
}
