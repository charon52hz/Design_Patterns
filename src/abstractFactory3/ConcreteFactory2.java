package abstractFactory3;

public class ConcreteFactory2 extends AbstractFactory{

    @Override
    public ConcreteProductA2 createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
