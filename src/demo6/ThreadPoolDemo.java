package demo6;

//static ExecutorService newCachedThreadPool() 创建一个默认线程池对象
//static newFixedThreadPool (int nThreads)  创建指定数量的线程池


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
      //创建默认线程池对象，默认最大容量为int的最大值
       ExecutorService executorService= Executors.newCachedThreadPool();
        //Executors--创建线程池对象
        //ExecutorService--管理线程池对象
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

       // Thread.sleep(2000);

        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

        executorService.shutdown();
    }
}
