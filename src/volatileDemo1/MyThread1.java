package volatileDemo1;

public class MyThread1 extends  Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while(Money.money==100000){

        }
        System.out.println("钱已经不是十万了");
    }
}
