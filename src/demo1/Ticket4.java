package demo1;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket4 implements Runnable {
    //static关键字共享数据
    private static int ticketCount = 100;
    private Object object = new Object();
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticketCount == 0) {
                    break;
                } else {
                    Thread.sleep(100);
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下票数：" + ticketCount);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
