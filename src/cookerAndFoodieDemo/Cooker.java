package cookerAndFoodieDemo;
    /*
           生产者：
            * 1.判断是否有食物
            * 2.有就等待,没有就做
            * 3.做好放在桌上
            * 4.做完唤醒消费者吃
    */

public class Cooker extends Thread {
    private Desk desk;
      

    public Cooker() {

    }

    public Cooker(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if(desk.getCount()==0){
                    break;
                }else {
                    if (desk.isFlag()) {
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("正在生产食物食物");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }
                }
            }
        }
    }
}
