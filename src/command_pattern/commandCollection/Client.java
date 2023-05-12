package command_pattern.commandCollection;

/**
 * AbstractCommand:抽象命令类，声明请求方法
 * Add Command：具体命令类，调用接收者，实现具体的请求方法
 * Adder：接收者，执行与命令相关的方法
 * Calculator：命令的发出者，
 */
public class Client {
    public static void main(String[] args) {
        AbstractCommand command = new AddCommand();
        Calculator calculator = new Calculator();
        calculator.setCommand(command);

        System.out.println("当前结果："+calculator.compute(2));
        System.out.println("当前结果："+calculator.compute(3));

        calculator.undo();
        calculator.redo();
        System.out.println("当前结果："+calculator.compute(5));
        calculator.redo();
        calculator.undo();
        calculator.redo();
    }
}
