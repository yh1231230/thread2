package arrayBlockingQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    private ArrayBlockingQueue<String> abq;

    public Cooker() {

    }

    public Cooker(ArrayBlockingQueue<String> abq) {
        this.abq=abq;
    }

    @Override
    public void run() {
        while(true) {
                try {
                    abq.put("汉堡包");
                    System.out.println("放了一个汉堡");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
