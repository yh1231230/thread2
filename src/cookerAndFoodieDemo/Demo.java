package cookerAndFoodieDemo;

public class Demo {
    /*
    * 消费者：
    * 1.判断是否有食物
    * 2.没有就等待
    * 3.有就吃
    * 4.吃完唤醒生产者生产，食物-1；

    * 生产者：
    * 1.判断是否有食物
    * 2.有就等待
    * 3.没有就做
    * 4.做完唤醒消费者吃
    */

    public static void main(String[] args) {
        Desk desk=new Desk(false,5);

        Foodie f=new Foodie(desk);
        Cooker c=new Cooker(desk);
        f.start();
        c.start();

    }


}
