package BuilderPattern;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        System.out.println("创建A部件");
    }

    @Override
    public void buildPartB() {
        System.out.println("创建B部件");
    }

    @Override
    public void buildPartC() {
        System.out.println("创建C部件");
    }

    @Override
    public Product getResult() {//返回一个完整的产品
        return super.getResult();
    }
}
