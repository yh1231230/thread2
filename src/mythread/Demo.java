package mythread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        //     mt1.start();
        //      mt2.start();

        MyRunnable mr1 = new MyRunnable();
        MyRunnable mr2 = new MyRunnable();
        //      new Thread(mr1).start();
        //      new Thread(mr2).start();

        //线程开启后执行call方法
        MyCallable mc1 = new MyCallable();
        MyCallable mc2 = new MyCallable();
        //可获取线程执行完毕后的结果，也可以作为参数传递给Thread对象
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        Thread t1 = new Thread(ft1);
        t1.start();
        String s1 = ft1.get();
        System.out.println(s1);
    }
}
