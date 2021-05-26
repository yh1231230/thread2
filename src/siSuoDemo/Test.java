package siSuoDemo;

//模拟死锁
public class Test {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();


        new Thread(() -> {
            while (true) {
                synchronized (objA) {
                    synchronized (objB) {
                        System.out.println("小A走路");
                    }
                }
            }
        }).start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (objB) {
                        synchronized (objA) {
                            System.out.println("小B走路");
                        }
                    }
                }
            }
        }.start();

    }
}
