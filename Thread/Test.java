package Thread;

public class Test implements Runnable{
    int num;
    Test(int i){
    this.num=i;
    }
    @Override
    public void run() {
        System.out.println("Num is :"+num+" Thread Name is :"+Thread.currentThread().getName());
    }
}
