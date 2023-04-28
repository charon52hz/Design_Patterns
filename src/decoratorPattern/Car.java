package decoratorPattern;

public class Car implements Transform{

    @Override
    public void move() {
        System.out.println("具有汽车行驶功能");
    }
}
