package demo6;

/*
    自定义线程池
    参数1：核心线程数             int类型，不能小于0
    参数2：总共线程数             int类型 不能小于核心线程数量
    参数3：空闲线程存活时间数      不能小于0
    参数4：空闲线程存活时间单位     TimeUnit工具类下的时间单位
    参数5：任务队列               BlockingQueue
    参数6：创建线程工厂            Executors.defaultThreadFactory() ,Executors的默认创建工厂
    参数7：任务的拒绝策略          new ThreadPoolExecutor.AbortPolicy() 线程池的默认拒绝策略
          ①什么时候拒绝  提交的任务数 > 池子最大线程数 + 队列容量
          ②如何拒绝     1.ThreadPoolExecutor.AbortPolicy() 默认方式，丢弃任务并抛出异常
                       2.ThreadPoolExecutor.DiscardPolicy() 丢弃任务但不抛出异常 不推荐使用该方式
                       3.ThreadPoolExecutor.DiscardOldestPolicy() 抛弃队列中等待时间最长的任务然后把当前任务加入到队列中
                       4.ThreadPoolExecutor.CallerRunsPolicy() 调用任务的run()方法绕过线程池直接执行

 */


import java.util.concurrent.*;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        ExecutorService executorService1=Executors.newCachedThreadPool();
        ExecutorService executorService2=Executors.newFixedThreadPool(5);
        MyRunnable runnable=new MyRunnable();
        executorService1.submit(runnable);
        executorService1.submit(runnable);
        executorService2.submit(runnable);
        executorService1.shutdown();
        executorService2.shutdown();

        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                2,
                5,
                2,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        pool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"执行了");
        });
        pool.shutdown();
    }
}
