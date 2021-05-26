package semaphoreDemo;

import threadDemo.MyThread;

import java.util.concurrent.Semaphore;

public class MyThread3 extends Thread {
    private Semaphore semaphore;
    private String name;

    public MyThread3(Semaphore semaphore,String name) {
        super(name);
        this.semaphore=semaphore;
    }

    @Override
    public void run() {
        try {
            for (int i=1;i<10;i++) {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+"获得通行证");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+"归还通行证");
                semaphore.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
