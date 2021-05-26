package threadPoolDemo;

//static ExecutorService newCachedThreadPool() 创建一个默认线程池对象
//static ExecutorService newFixedThreadPool (int nThreads)  创建指定数量的线程池


import java.util.concurrent.*;

public  class ThreadPoolDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
      //创建指定数量的线程池，最大容量为10
       ExecutorService executorService= Executors.newFixedThreadPool(10);

       //execute()创建线程无法获得返回值，异常处理会直接在控制台，异常不影响其他线程
        executorService.execute(() -> System.out.println(Thread.currentThread().getName()+"执行了"));
        //Executors--创建线程池对象
        //ExecutorService--管理线程池对象

        //submit()创建线程会返回Future对象，可以通过get()方法获取返回值，异常信息可通过get获得，异常会阻塞其他线程
        Future<Object> submit = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "执行了");
                return "返回值";
            }
        });

        System.out.println(submit.get());
        // Thread.sleep(2000);

        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

        executorService.shutdown();

        ThreadPoolExecutor pool=(ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());
    }
}
