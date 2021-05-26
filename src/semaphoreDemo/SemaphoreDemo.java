package semaphoreDemo;
/*
    创建            Semaphore对象
    发放通行证       acquire()
    收回通行证       release()
    没有通行证则等待
 */


import threadDemo.MyThread;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        MyThread1 my1 = new MyThread1(semaphore, "A");
        MyThread2 my2 = new MyThread2(semaphore, "B");
        MyThread3 my3 = new MyThread3(semaphore, "C");
            my1.start();
            my2.start();
            my3.start();
    }
}
