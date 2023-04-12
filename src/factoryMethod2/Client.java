package factoryMethod2;

/**
 * 工厂方法模式是简单工厂模式的进一步抽象和推广，使用面向对象的多态性，保持了简单工厂的优点，克服了它的缺点
 * 简单工厂模式中工厂类的职责相对过重，增加新产品时需要修改工厂类的判断逻辑，这一点违背了开闭原则
 *
 * 在工厂方法模式中，核心的工厂类不再负责所有产品的创建，而是仅负责给出接口，将具体的创建工作交给工厂子类去做
 * 当系统扩展需要添加新的产品对象时，仅需要添加一个具体产品对象以及一个负责生产它的具体工厂子类对象，
 * 原有的工厂对象不需要进行任何修改，也不需修改客户端，很好地符合了开闭原则
 *
 * 缺点是增加了系统复杂度和开销，在添加新产品时，需要编写具体新产品类以及对应的具体工厂类
 * */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        factory = new ProductAFactory();

        AbstractProduct product;
        product = factory.factoryMethod();
        product.ProductMethod();
    }
}
