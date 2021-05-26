package arrayBlockingQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        //创建阻塞队列对象，规定容量最多为1
        ArrayBlockingQueue<String> arrayBlockingQueue=new ArrayBlockingQueue<>(2);
        //存储元素
        arrayBlockingQueue.put("汉堡");
        arrayBlockingQueue.put("薯条");
        //取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());

        System.out.println("程序结束");

    }
}
