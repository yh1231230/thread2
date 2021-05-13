package demo4;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    private ArrayBlockingQueue<String> abq;

    public Foodie() {

    }

    public Foodie(ArrayBlockingQueue<String> abq) {
        this.abq=abq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take=abq.take();
                System.out.println("从队列中获取了"+take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
