package atomicDemo5;

public class Demo2 {
    public static void main(String[] args) {
        Demo d=new Demo();
        for (int i = 0; i < 100; i++) {
            new Thread(d).start();
        }
    }
}
