package myVolatile;

//通过volatile关键字解决线程不会查看共享区域最新值的问题
//被volatile关键字修饰的变量每次线程调用时都会去共享区域查看最新值

public class Money {
    //通过volatile解决
    public static volatile int money=100000;


}
