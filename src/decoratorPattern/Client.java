package decoratorPattern;

/**
 * Transform：抽象构件Transform，声明了在具体构件类中实现的业务方法，引入它可以使
 * 客户端一致地处理未被装饰的对象和装饰之后的对象，实现客户的透明操作。
 * Car：具体构件，实现抽象构件声明的方法，装饰器可以给它增加额外的功能（方法）
 * Decorator：抽象装饰类，用于给具体构件增加职责，但具体实现在其子类中。它维护一个指向抽象构件对象的引用，
 * 通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 * RobotTransform/AirplaneTransform：具体装饰类，向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，
 * 它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 *
 * 由于具体构件类和装饰类都实现了相同的抽象构件接口，因此装饰模式以对客户透明的方式动态地给一个对象附加上更多的责任。
 */

public class Client {
    public static void main(String[] args) {
        //普通变形金刚
        Transform transform;
        transform = new Car();
        transform.move();
        System.out.println("*******************");
        //添加飞行功能
        AirplaneTransform airplane = new AirplaneTransform(transform);
        airplane.move();
        //添加说话功能
        System.out.println("*******************");
        RobotTransform robot = new RobotTransform(airplane);
        robot.move();
    }
}
