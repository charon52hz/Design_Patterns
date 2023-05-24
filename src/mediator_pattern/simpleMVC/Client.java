package mediator_pattern.simpleMVC;

/**
 * Controller：抽象中介者类，用于和各组件进行交互
 * UserController：具体中介者类，维持了对各个组件的引用，协调各个组件对象来实现协作行为
 * Component：抽象同事类，定义各种组件的公用属性和方法
 * UserModel、UserView：具体同事类，各个组件对象之间需要通信时，先于中介者通信，通过中介者间接完成与其他组件的通信
 *
 * 通过中介者提供的中转作用，各个同事对象就不再需要显式引用其他同事，当需要和其他同事进行通信时，可通过中介者来实现间接调用。
 * 中介者可以更进一步的对同事之间的关系进行封装，同事可以一致的和中介者进行交互，而不需要指明中介者需要具体怎么做，中介者
 * 根据封装在自身内部的协调逻辑，对同事的请求进行进一步处理，将同事成员之间的关系行为进行分离和封装。
 */
public class Client {
    public static void main(String[] args) {
        Controller userController;
        Component c1,c2;
        c1 = new UserModel("张三", 18, "普通用户");
        UserModel model = (UserModel) c1;
        c2 = new UserView();
        UserView view = (UserView) c2;
        userController = new UserController(model,view);
        userController.modelShowOnView();
        model.setType("钻石会员");
        userController.modelShowOnView();

    }
}
