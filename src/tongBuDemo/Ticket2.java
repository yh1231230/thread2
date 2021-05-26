package tongBuDemo;

public class Ticket2 extends Thread {
    //static关键字共享数据
    private static int ticketCount=100;
    private static final Object object=new Object();
    @Override
    public void run() {

        while(true){
            //同步代码块
            synchronized (object) {
                if (ticketCount == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下票数：" + ticketCount);
                }
            }
        }
    }
}
