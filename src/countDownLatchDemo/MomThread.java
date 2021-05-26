package countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

public class MomThread implements Runnable {
    private CountDownLatch latch;

    public MomThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"在收拾碗筷");
    }
}
