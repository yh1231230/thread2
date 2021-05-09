package demo1;

public class Test {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);
        Thread t3=new Thread(ticket);

        /*
            Ticket2 tick1 = new Ticket2();
            Ticket2 tick2 = new Ticket2();
            tick1.setName("窗口1");
            tick2.setName("窗口2");
            tick1.start();
            tick2.start();

         */

        /*
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
        */

        /*
        Ticket3 ticket3=new Ticket3();
        Thread t4=new Thread(ticket3);
        Thread t5=new Thread(ticket3);
        t4.setName("窗口1");
        t5.setName("窗口2");
        t4.start();
        t5.start();
        */
    }
}
