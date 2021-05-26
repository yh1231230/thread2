package countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

public class ChildThread2 implements Runnable {
    private CountDownLatch count;

    public ChildThread2(CountDownLatch count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"吃第"+i+"个饺子");
        }
        count.countDown();
    }
}
