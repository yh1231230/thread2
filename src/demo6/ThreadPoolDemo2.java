package demo6;

//static ExecutorService newCachedThreadPool() 创建一个默认线程池对象
//static ExecutorService newFixedThreadPool (int nThreads)  创建指定数量的线程池


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws InterruptedException {
      //创建指定数量的线程池，最大容量为10
       ExecutorService executorService= Executors.newFixedThreadPool(10);

        //Executors--创建线程池对象
        //ExecutorService--管理线程池对象
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

       // Thread.sleep(2000);

        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

        executorService.shutdown();

        ThreadPoolExecutor pool=(ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());
    }
}
