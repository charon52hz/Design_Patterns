package Singleton;

import java.util.ArrayList;

/*
单例模式实现多例:
multitonList:私有成员变量，存放多例
NUMBER：常量，定义可创建的实例数量
Multiton()：私有构造函数，确保用户无法通过new直接实例化它
getInstance()：公有静态方法，如果实例数量未满，则创建新实例并返回，如果满返回最后一个实例对象
 */
public class Multiton {
    private static ArrayList<Multiton> multitonList = new ArrayList<>();
    private final static int NUMBER = 3;

    private Multiton(){
    }

    public static Multiton getInstance(){
        if (multitonList.size()<NUMBER){
            System.out.println("可创建的实例未满，创建新实例");
            Multiton instance = new Multiton();
            multitonList.add(instance);
            return instance;
        }else
            System.out.println("不能创建新实例，使用最后一个实例对象");
            return multitonList.get(NUMBER-1);

    }
}
