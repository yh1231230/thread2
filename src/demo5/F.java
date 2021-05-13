package demo5;

public class F implements Runnable {
    private D d;

    public F(D d) {
        this.d=d;
    }

    @Override
    public void run() {
        while (true){
            synchronized (d.getLock()){
                if(d.getCount()==0)
                    break;
                else {
                    if(d.isFlag()){
                        d.setCount(d.getCount()-1);
                        System.out.println("吃了一个面包");
                        d.setFlag(false);
                        d.getLock().notifyAll();
                    }
                    else {
                        try {
                            d.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
