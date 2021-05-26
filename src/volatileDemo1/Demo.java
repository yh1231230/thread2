package volatileDemo1;



public class Demo {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1("小路");
        t1.start();



        MyThread2 t2=new MyThread2();
        t2.setName("小王");
        t2.start();
    }
}
