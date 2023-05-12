package command_pattern.example1;

/**
 * 命令模式的核心在于引入了命令类，通过命令类来降低发送者和接收者的耦合度，请求发送者只需指定一个命令对象，再通过命令对象来调用请求接收者的处理方法
 *
 * AbstractCommand:抽象命令类，声明了用于执行请求的execute方法，通过这些方法可以命令接收者进行相关操作
 * OpenTV、CloseTV、ChangeChannel Command：具体命令类，对应具体的接收者对象，实现execute方法时，将调用接收者的相关操作
 * Controller：命令的发出者，通过调用具体的命令对象来执行命令。调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。
 * 在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作
 * Television：命令的接收者，执行与命令相关的操作，具体实现对命令的业务处理。
 *
 * 命令模式的本质是对请求进行封装，一个请求对应于一个命令，将发出命令的责任和执行命令的责任分割开。
 */
public class Client {
    public static void main(String[] args) {
        AbstractCommand command1,command2,command3;
        command1 = new OpenTVCommand();
        command2 = new CloseTVCommand();
        command3 = new ChangeChannelCommand();

        Controller controller = new Controller(command1, command2, command3);
        controller.open();
        controller.change();
        controller.close();
    }
}
