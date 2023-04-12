package factoryMethod2;

public class ProductAFactory extends Factory{
    @Override
    public AbstractProduct factoryMethod() {
        return new ProductA();
    }
}
