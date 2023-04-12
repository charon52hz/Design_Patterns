package factoryMethod2;

public class ProductBFactory extends Factory{
    @Override
    public AbstractProduct factoryMethod() {
        return new ProductB();
    }
}
