package semaphoreDemo;

import java.util.concurrent.Semaphore;

public class MyThread1 extends Thread {
    private Semaphore semaphore;

    public MyThread1(Semaphore semaphore, String name) {
        super(name);
        this.semaphore=semaphore;
    }

    @Override
    public void run() {
        try {
            for (int i=1;i<10;i++) {
                semaphore.acquire();
                System.out.println(""+Thread.currentThread().getName()+"获得通行证");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+"归还通行证");
                semaphore.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
