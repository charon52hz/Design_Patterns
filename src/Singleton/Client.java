package Singleton;

public class Client {
    public static void main(String[] args) {
//        Singleton_eager singletonEager = Singleton_eager.getInstance();
//        Singleton_eager singleton2 = Singleton_eager.getInstance();
//        System.out.println(singletonEager.hashCode());
//        System.out.println(singleton2.hashCode());

//        System.out.println("懒汉式，线程不安全");
//        Singleton_lazy_notSafe instance1 = Singleton_lazy_notSafe.getInstance();
//        Singleton_lazy_notSafe instance2 = Singleton_lazy_notSafe.getInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

        Multiton instance1 = Multiton.getInstance();
        Multiton instance2 = Multiton.getInstance();
        Multiton instance3 = Multiton.getInstance();
        Multiton instance4 = Multiton.getInstance();
        Multiton instance5 = Multiton.getInstance();
        Multiton instance6 = Multiton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
        System.out.println(instance5.hashCode());
        System.out.println(instance6.hashCode());
    }
}
