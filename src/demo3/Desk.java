package demo3;

import java.util.Queue;

public class Desk {

    //定义标记
    //true为存在，允许消费者执行
    //false为不存在，允许生产者执行
    //public static boolean flag=false;
    private boolean flag;

    //食物总数
    // public static int count=10;
    private int count;

    //锁对象
    //public static final Object lock=new Object();
    private final Object lock=new Object();

    public Desk() {
        this(false,5);
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
