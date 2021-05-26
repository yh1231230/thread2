package volatileDemo2;

public class MyThread1 extends  Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while(true) {
            synchronized (Money.lock) {
                if (Money.money != 100000) {
                    System.out.println("钱已经不是十万了");
                    break;
                }
            }
        }
    }
}
