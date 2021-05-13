package demo5;

public class D {
    private int count;
    private boolean flag;
    private final Object lock=new Object();

    public D(){
        this(5,false);
    }

    public D(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getLock() {
        return lock;
    }
}
