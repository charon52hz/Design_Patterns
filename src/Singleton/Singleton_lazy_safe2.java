package Singleton;

/*
双重检查
 */
public class Singleton_lazy_safe2 {
    private static Singleton_lazy_safe2 instance;

    private Singleton_lazy_safe2(){}

    public static Singleton_lazy_safe2 getInstance(){
        if (instance==null){
            synchronized (Singleton_lazy_safe2.class){
                if (instance==null){
                    instance = new Singleton_lazy_safe2();
                }
            }
        }
        return instance;
    }
}
