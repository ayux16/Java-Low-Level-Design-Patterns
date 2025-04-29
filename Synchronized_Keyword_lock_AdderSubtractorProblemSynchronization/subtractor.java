package Synchronized_Keyword_lock_AdderSubtractorProblemSynchronization;

import java.util.concurrent.locks.Lock;

public class subtractor implements Runnable {
    Count c;
    subtractor(Count count){
        this.c=count;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            synchronized(Count.class){
                c.value-=i;
            }
        }
    }
}
