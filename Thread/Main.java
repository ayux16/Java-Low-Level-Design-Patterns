package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            Test t=new Test(i);
//            Thread thread=new Thread(t);
//            thread.start();
//        }
//        System.out.println("This thread is printed by :"+ Thread.currentThread().getName());

        //Reusing Thread pool using * EXECUTER SERVICE *
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=1;i<=50;i++) {
            Test test = new Test(i);
            executor.execute(test);
        }
    }
}
