package simpleFactory1;
/**
 * 将对象的创建和对象本身的业务处理分离，降低系统的耦合度。
 * 当需要什么对象时，只需要传入一个正确的参数，就可以获得所需的对象，而无须知道具体的创建细节
 * 创建了ProductFactory之后，客户就变成ProductFactory对象的客户，后期如果需要Product对象直接从工厂中获取即可。这样就解除了和Product具体实现类的耦合
 *
 *简单工厂模式的最大问题在于“工厂类的职责相对过重”，增加新产品时需要修改工厂类的判断逻辑，这一点违背了开闭原则
 */
public class Client {
    public static void main(String[] args) {
        AbstractProduct product;
        product = ProductFactory.getPayMethod("b");
        product.ProductMethod();
    }
}
