package Singleton;
/*
懒汉式（线程不安全）
起到了懒加载的效果，但是只能在单线程下使用。
如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过
了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 */
public class Singleton_lazy_notSafe {
    private static Singleton_lazy_notSafe instance;
    //1.私有构造方法
    private Singleton_lazy_notSafe() { }
    //2.提供一个公有的静态方法，当使用该方法时，才会创建实例（懒汉式）
    public static Singleton_lazy_notSafe getInstance(){
        if (instance==null){
            instance = new Singleton_lazy_notSafe();
        }
        return instance;
    }
}
