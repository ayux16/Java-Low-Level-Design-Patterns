package Synchronized_Keyword_lock_AdderSubtractorProblemSynchronization;

import java.util.concurrent.locks.Lock;

public class adder implements Runnable {
    private Count c;

    adder(Count count){
        this.c=count;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            synchronized(Count.class){
                c.value+=i;
            }
        }
    }

}
