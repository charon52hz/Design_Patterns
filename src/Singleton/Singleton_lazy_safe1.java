package Singleton;
/*
1.解决了线程安全问题
2.效率太低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行
一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 */
public class Singleton_lazy_safe1 {
    private static Singleton_lazy_safe1 instance;

    private Singleton_lazy_safe1(){}

    //synchronized关键字，加入线程锁，使用同步处理的代码，解决线程安全问题
    public static synchronized  Singleton_lazy_safe1 getInstance(){
        if (instance==null){
            instance = new Singleton_lazy_safe1();
        }
        return instance;
    }
}
