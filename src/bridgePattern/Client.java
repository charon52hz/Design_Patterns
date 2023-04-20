package bridgePattern;

/*
 * 在多维度变化融合在一起时，扩展一个维度会影响其他的维度（蜡笔的粗度增加一种，则该粗度的各种颜色都需要添加），不同维度之间存在较强的耦合，需要解耦。
 * 将维度分离，使不同的维度可以独立变化——使用桥接模式
 * 桥接模式的思路是：将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥
 * 
 * 桥接模式用一种巧妙的方式处理多层继承存在的问题，用抽象关联取代了传统的多层继承，将类之间的静态继承关系转换为动态的对象组合关系，使得系统更加灵活，并易于扩展，同时有效控制了系统中类的个数
 * 
 *  Client:桥接模式的调用者
 * Platform：java程序要在具体平台上实现，Platform是运行平台的接口，声明了基本的beRun操作，具体实现交给子类
 * JavaApplication：java程序的抽象类，关联了Platform类，定义了Platform类型的对象，可以维护该对象。可以包含抽象的业务方法function(),也可以包含具体的业务方法setPlatform()
 * MaxApp/MinApp：JavaApplication类的子类，是具体的java程序
 * Windows/Unix：实现了Platform接口，是java程序运行的具体平台
 */

public class Client {
    public static void main(String[] args) {
        JavaApplication app;
        Platform platform;

        app = new MinApp();
        platform = new Unix();

        app.setPlatform(platform);
        app.function();
    }
}
