package mapDemo;

import java.util.Map;

public class Test {
    Map<String,String> map;

    Test(Map map){
        this.map=map;


        Thread t1=new Thread(()->{
            for (int i = 0; i < 25; i++) {
                map.put(i+"",i+"");
            }
        });


        Thread t2=new Thread(()->{
            for (int i = 25; i < 50; i++) {
                map.put(i+"",i+"");
            }
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0;i<50;i++) {
            System.out.println(map.get(i+""));
        }
    }

}
