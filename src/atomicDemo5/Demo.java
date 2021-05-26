package atomicDemo5;


import java.util.concurrent.atomic.AtomicInteger;

public class Demo implements Runnable {
  // public int count=0;

    //CAS 乐观锁
    AtomicInteger ac=new AtomicInteger(0);

    @Override
    public void run() {
 /*          悲观锁
            synchronized (this) {
            for (int i = 0; i < 100; i++) {
                count++;
                System.out.println("已经送了"+count+"个冰淇淋");
            }
        }
  */
        for (int i = 0; i <100 ; i++) {
            int count=ac.incrementAndGet();
            System.out.println("已经送了"+count+"个冰淇淋");
        }
    }
}
