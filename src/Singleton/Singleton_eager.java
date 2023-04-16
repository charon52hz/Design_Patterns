package Singleton;

/*
饿汉式
优点：写法比较简单，在类装载的时候就完成实例化。避免了线程同步问题。
缺点：在类装载的时候就完成实例化，没有达到懒加载的效果。如果从始至终
从未使用过这个实例，则会造成内存的浪费

 */

public class Singleton_eager {
    //1.构造器私有化
    private Singleton_eager() {
    }
    //2.在本类的内部创建对象实例
    private final static Singleton_eager instance = new Singleton_eager();
    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton_eager getInstance(){
        return instance;
    }
}
