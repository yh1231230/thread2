package countDownLatchDemo;
/*
    CountDownLatch(int count)
    await();
    countDown();
 */


import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        MomThread m = new MomThread(countDownLatch);
        ChildThread1 c1 = new ChildThread1(countDownLatch);
        ChildThread2 c2 = new ChildThread2(countDownLatch);
        ChildThread3 c3 = new ChildThread3(countDownLatch);
        Thread mom = new Thread(m);
        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        Thread tc3 = new Thread(c3);
        mom.setName("mom");
        tc1.setName("长子");
        tc2.setName("次子");
        tc3.setName("末子");
        mom.start();
        tc1.start();
        tc2.start();
        tc3.start();
    }
}
