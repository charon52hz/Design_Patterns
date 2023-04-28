package decoratorPattern;

public class AirplaneTransform extends Decorator {
    public AirplaneTransform(Transform transform) {
        super(transform);
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
    public void fly(){
        System.out.println("现在拥有了飞行功能...");
    }
}
