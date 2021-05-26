package threadDemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        //返回值表示线程运行完毕后的结果
        for (int i = 0; i <100 ; i++) {
            System.out.println("次数"+i);
        }
        return "完成";
    }
}
