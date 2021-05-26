package arrayBlockingQueueDemo;


import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //创建阻塞队列对象，规定容量最多为1
        ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<>(1);

        Cooker c=new Cooker(abq);
        Foodie f=new Foodie(abq);
        c.start();
        f.start();

    }
}
