package decoratorPattern;

public class RobotTransform extends Decorator {
    public RobotTransform(Transform transform) {
        super(transform);
    }
    public void say(){
        System.out.println("现在拥有了说话功能...");
    }

    @Override
    public void move() {
        super.move();
        say();
    }
}
