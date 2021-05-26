package tongBuDemo;

public class Ticket implements Runnable {
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (this) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "在卖票，还剩下票数：" + ticket);
                }
            }
        }
    }
}
