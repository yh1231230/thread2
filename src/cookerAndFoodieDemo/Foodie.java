package cookerAndFoodieDemo;
    /*
            消费者：
            * 1.判断是否有食物
            * 2.没有就等待
            * 3.有就吃
            * 4.吃完唤醒生产者生产，食物-1；
     */

public class Foodie extends Thread {
    private Desk desk;
    public Foodie(){

    }

    public Foodie(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (desk.isFlag()) {
                        //有
                        System.out.println("在吃食物");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    }else {
                        //没有则等待
                        //锁对象是什么，就必须使用该对象去调用等待或唤醒方法
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }
    }
}
