package Mutex_AdderSubtractorProblemSynchronization;

import java.util.concurrent.locks.Lock;

public class adder implements Runnable {
    private Count c;
    Lock lock;
    adder(Count count,Lock lock){
        this.c=count;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            lock.lock();
            c.value+=i;
            lock.unlock();
        }
    }

}
