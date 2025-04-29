package Mutex_AdderSubtractorProblemSynchronization;

import java.util.concurrent.locks.Lock;

public class subtractor implements Runnable {
    Count c;
    Lock lock;
    subtractor(Count count,Lock lock){
        this.lock = lock;
        this.c=count;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            lock.lock();
            c.value-=i;
            lock.unlock();
        }
    }
}
