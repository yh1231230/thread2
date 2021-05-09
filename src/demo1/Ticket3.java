package demo1;

public class Ticket3 implements Runnable {
    private static int ticketCount = 100;

    @Override
    public void run() {
        while (true) {
            //同步方法
            if ("窗口1".equals(Thread.currentThread().getName())) {
               boolean result= synchronizedMethod();
               if(result)
                   break;
            }


            //同步代码块
            if ("窗口2".equals(Thread.currentThread().getName())) {
                synchronized (Ticket3.class) {
                    if (ticketCount == 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(50);
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

    private static synchronized boolean synchronizedMethod() {
        if (ticketCount == 0) {
            return true;
        } else {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "在卖票，还剩下票数：" + ticketCount);
            return false;
        }

    }
}
