package demo5;

public class C implements Runnable {
    private D d;

    public C(D d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true){
            synchronized (d.getLock()) {
                if (d.getCount() == 0) {
                    break;
                } else {
                    if(d.isFlag()){
                        try {
                            d.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        d.setFlag(true);
                        System.out.println("做了一个面包");
                        d.getLock().notifyAll();
                    }
                }
            }
        }
    }
}
