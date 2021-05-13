package demo5;

public class Run {
    public static void main(String[] args) {
        D d=new D(5,false);
        C c=new C(d);
        F f=new F(d);
        new Thread(c).start();
        new Thread(f).start();
    }
}
