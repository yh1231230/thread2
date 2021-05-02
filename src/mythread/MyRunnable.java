package mythread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("启动线程"+i);
        }
    }
}
