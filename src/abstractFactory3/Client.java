package abstractFactory3;

/**
 * 工厂方法模式中，每一个具体的工厂只负责生产一类具体产品，
 * 当出现新产品时，需要编写具体新产品类以及对应的具体工厂类，这样增加了系统的复杂度和开销
 *
 * 有时候我们需要一个具体工厂可以生产多种产品或者不是一个简单的产品（多个位于不同产品等级结构中属于不同类型的具体产品）（一个产品族）
 * 工厂方法模式针对一个产品等级结构，抽象工厂模式面对多个产品等级结构
 *
 * 抽象工厂模式隔离了具体类的生成。只需改变具体工厂的实例，就可以改变整个软件系统的行为
 * 可以使系统始终使用一个产品族中的对象。添加新的产品族很方便。
 *
 * 添加新的产品对象时，难以扩展（开闭原则的倾斜性）
 *
 * 角色：
 * 抽象工厂：声明生成抽象产品的方法
 * 具体工厂：实现抽象工厂声明的方法，生成一组具体产品，构成产品族
 * 抽象产品：定义产品的业务方法
 * 具体产品：实现抽象产品定义的业务方法
 */
public class Client {
    public static void main(String[] args) {
        //生产一个1厂的A产品，2厂的B产品
        AbstractFactory factory;
        AbstractProductA productA;
        AbstractProductB productB;

        factory = new ConcreteFactory1();
        productA = factory.createProductA();
        productA.display();

        factory = new ConcreteFactory2();
        productB = factory.createProductB();
        productB.display();
    }
}
